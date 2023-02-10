#!/usr/bin/env bash

set -euo pipefail
IFS=$'\n\t'

PROJECT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
LIBPG_QUERY_TEMP_DIR=$(mktemp --directory)

pushd $LIBPG_QUERY_TEMP_DIR

wget https://github.com/pganalyze/libpg_query/archive/refs/tags/15-4.2.0.zip
unzip 15-4.2.0.zip

docker run --rm \
  --user $(id -u):$(id -g) \
  -v "$PWD/libpg_query-15-4.2.0":/usr/src/myapp \
  -w /usr/src/myapp gcc:11 make build_shared

cp libpg_query-15-4.2.0/libpg_query.so $PROJECT_DIR/src/main/resources/linux-x86-64/libpg_query.so

wget https://github.com/protocolbuffers/protobuf/releases/download/v21.12/protoc-21.12-linux-x86_64.zip
unzip protoc-21.12-linux-x86_64.zip

rm -rv $PROJECT_DIR/src/main/java/com/premiumminds/sonar/postgres/protobuf/

echo 'option java_multiple_files = true;' >> libpg_query-15-4.2.0/protobuf/pg_query.proto
echo 'option java_package = "com.premiumminds.sonar.postgres.protobuf";' >> libpg_query-15-4.2.0/protobuf/pg_query.proto

bin/protoc \
    --java_out=$PROJECT_DIR/src/main/java \
    --proto_path=libpg_query-15-4.2.0/protobuf/ \
    libpg_query-15-4.2.0/protobuf/pg_query.proto

patch -p1 --directory=$PROJECT_DIR < $PROJECT_DIR/Token.java.patch

popd
chmod -R +w $LIBPG_QUERY_TEMP_DIR
rm -r $LIBPG_QUERY_TEMP_DIR


