#!/usr/bin/env bash

set -euo pipefail
IFS=$'\n\t'

PROJECT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

echo "compile linux-x86-64"
docker build -f $PROJECT_DIR/linux-x86-64.Dockerfile -t linux-x86-64 $PROJECT_DIR/
CID=$(docker create linux-x86-64)
docker cp $CID:/work/libpg_query.so $PROJECT_DIR/src/main/resources/linux-x86-64/libpg_query.so
docker rm $CID

echo "compile linux-aarch64"
docker build -f $PROJECT_DIR/linux-aarch64.Dockerfile -t linux-aarch64 $PROJECT_DIR/
CID=$(docker create linux-aarch64)
docker cp $CID:/work/libpg_query.so $PROJECT_DIR/src/main/resources/linux-aarch64/libpg_query.so
docker rm $CID

echo "compile win32-x86-64"
docker build -f $PROJECT_DIR/win32-x86-64.Dockerfile -t win32-x86-64 $PROJECT_DIR/
CID=$(docker create win32-x86-64)
docker cp $CID:/work/libpg_query.so $PROJECT_DIR/src/main/resources/win32-x86-64/libpg_query.so.dll
docker cp $CID:/usr/lib/gcc/x86_64-w64-mingw32/14-win32/libgcc_s_seh-1.dll $PROJECT_DIR/src/main/resources/win32-x86-64/libgcc_s_seh-1.dll
docker rm $CID

echo "compile darwin-x86-64"
docker build -f $PROJECT_DIR/darwin-x86-64.Dockerfile -t darwin-x86-64 $PROJECT_DIR/
CID=$(docker create darwin-x86-64)
docker cp $CID:/work/libpg_query.dylib $PROJECT_DIR/src/main/resources/darwin-x86-64/liblibpg_query.so.dylib
docker rm $CID

echo "compile darwin-aarch64"
docker build -f $PROJECT_DIR/darwin-aarch64.Dockerfile -t darwin-aarch64 $PROJECT_DIR/
CID=$(docker create darwin-aarch64)
docker cp $CID:/work/libpg_query.dylib $PROJECT_DIR/src/main/resources/darwin-aarch64/liblibpg_query.so.dylib
docker rm $CID

echo "generate java sources"
LIBPG_QUERY_TEMP_DIR=$(mktemp --directory)

pushd $LIBPG_QUERY_TEMP_DIR

wget -q https://github.com/pganalyze/libpg_query/archive/refs/tags/18.0.0.tar.gz
echo 6ad7783f272acfd116455c66a03298a0cac9a9168281df547969219112f0260f  18.0.0.tar.gz | sha256sum -c
tar -zxf 18.0.0.tar.gz
SOURCES_DIR=libpg_query-18.0.0

wget -q https://github.com/protocolbuffers/protobuf/releases/download/v35.0/protoc-35.0-linux-x86_64.zip
echo a45cda0989c17dd950db55f6fbe1e5814c50fda08e87aa422980ac1f89dddbbc  protoc-35.0-linux-x86_64.zip | sha256sum -c
unzip protoc-35.0-linux-x86_64.zip

find $PROJECT_DIR/src/main/java/com/premiumminds/sonar/postgres/protobuf/ -type f -not -name package-info.java -delete

echo 'option java_multiple_files = true;' >> $SOURCES_DIR/protobuf/pg_query.proto
echo 'option java_package = "com.premiumminds.sonar.postgres.protobuf";' >> $SOURCES_DIR/protobuf/pg_query.proto

bin/protoc \
    --java_out=$PROJECT_DIR/src/main/java \
    --proto_path=$SOURCES_DIR/protobuf/ \
    $SOURCES_DIR/protobuf/pg_query.proto

patch -p1 --directory=$PROJECT_DIR < $PROJECT_DIR/Token.java.patch

popd
chmod -R +w $LIBPG_QUERY_TEMP_DIR
rm -r $LIBPG_QUERY_TEMP_DIR

echo "Done!"
