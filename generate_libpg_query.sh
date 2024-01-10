#!/usr/bin/env bash

set -euo pipefail
IFS=$'\n\t'

PROJECT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
LIBPG_QUERY_TEMP_DIR=$(mktemp --directory)

pushd $LIBPG_QUERY_TEMP_DIR

wget -q https://github.com/pganalyze/libpg_query/archive/refs/tags/16-5.1.0.zip
unzip 16-5.1.0.zip
SOURCES_DIR=libpg_query-16-5.1.0

echo "compile linux-x86-64"
docker create \
  --name crossbuild \
  --workdir /work/$SOURCES_DIR \
  multiarch/crossbuild \
    make -j build_shared
docker cp $SOURCES_DIR crossbuild:/work/
docker start -ai crossbuild
docker cp crossbuild:/work/$SOURCES_DIR/libpg_query.so \
  $PROJECT_DIR/src/main/resources/linux-x86-64/libpg_query.so
docker rm crossbuild

echo "compile linux-aarch64"
docker create \
  --name crossbuild \
  --workdir /work/$SOURCES_DIR \
  -e CROSS_TRIPLE=aarch64-linux-gnu \
  multiarch/crossbuild \
    make -j build_shared
docker cp $SOURCES_DIR crossbuild:/work/
docker start -ai crossbuild
docker cp crossbuild:/work/$SOURCES_DIR/libpg_query.so \
  $PROJECT_DIR/src/main/resources/linux-aarch64/libpg_query.so
docker rm crossbuild

echo "compile win32-x86-64"
docker create \
  --name crossbuild \
  --workdir /work/$SOURCES_DIR \
  -e CROSS_TRIPLE=x86_64-w64-mingw32 \
  multiarch/crossbuild \
    make -j build_shared OS=Windows_NT
docker cp $SOURCES_DIR crossbuild:/work/
docker start -ai crossbuild
docker cp crossbuild:/work/$SOURCES_DIR/libpg_query.so \
  $PROJECT_DIR/src/main/resources/win32-x86-64/libpg_query.so.dll
docker cp crossbuild:/usr/lib/gcc/x86_64-w64-mingw32/6.3-win32/libgcc_s_seh-1.dll \
  $PROJECT_DIR/src/main/resources/win32-x86-64/libgcc_s_seh-1.dll
docker rm crossbuild

docker build -f $PROJECT_DIR/darwin.Dockerfile -t darwin-build-support $PROJECT_DIR/

echo "compile darwin-x86-64"
docker create --name crossbuild --workdir /work/$SOURCES_DIR darwin-build-support bash -c 'patch -p1 < /work/darwin.patch; make CC=o64-clang -j build_shared'
docker cp $SOURCES_DIR crossbuild:/work/
docker cp $PROJECT_DIR/darwin.patch crossbuild:/work/darwin.patch
docker start -ai crossbuild
docker cp crossbuild:/work/$SOURCES_DIR/libpg_query.dylib \
  $PROJECT_DIR/src/main/resources/darwin-x86-64/liblibpg_query.so.dylib
docker rm crossbuild

echo "compile darwin-aarch64"
docker create --name crossbuild --workdir /work/$SOURCES_DIR darwin-build-support bash -c 'patch -p1 < /work/darwin.patch; make CC=aarch64-apple-darwin22.2-cc -j build_shared'
docker cp $SOURCES_DIR crossbuild:/work/
docker cp $PROJECT_DIR/darwin.patch crossbuild:/work/darwin.patch
docker start -ai crossbuild
docker cp crossbuild:/work/$SOURCES_DIR/libpg_query.dylib \
  $PROJECT_DIR/src/main/resources/darwin-aarch64/liblibpg_query.so.dylib
docker rm crossbuild

# generate java sources
wget -q https://github.com/protocolbuffers/protobuf/releases/download/v25.1/protoc-25.1-linux-x86_64.zip
unzip protoc-25.1-linux-x86_64.zip

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


