#!/usr/bin/env bash

set -euo pipefail
IFS=$'\n\t'

PROJECT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
LIBPG_QUERY_TEMP_DIR=$(mktemp --directory)

pushd $LIBPG_QUERY_TEMP_DIR

# compile x86-64
docker run --name gcc-libpgquery-amd64 \
  gcc:11 \
  bash -c 'wget -q https://github.com/pganalyze/libpg_query/archive/refs/tags/16-5.0.0.zip && unzip 16-5.0.0.zip && cd libpg_query-16-5.0.0 && make -j build_shared'
docker cp gcc-libpgquery-amd64:libpg_query-16-5.0.0/libpg_query.so $PROJECT_DIR/src/main/resources/linux-x86-64/libpg_query.so

# compile aarch64
docker run --name gcc-libpgquery-aarch64 \
  gcc:11 \
  bash -c 'wget -q https://github.com/pganalyze/libpg_query/archive/refs/tags/16-5.0.0.zip && unzip 16-5.0.0.zip && cd libpg_query-16-5.0.0 && apt-get update && apt install -y gcc-aarch64-linux-gnu && export CC=aarch64-linux-gnu-gcc && make -j build_shared'
docker cp gcc-libpgquery-aarch64:libpg_query-16-5.0.0/libpg_query.so $PROJECT_DIR/src/main/resources/linux-aarch64/libpg_query.so

# generate java sources
wget https://github.com/protocolbuffers/protobuf/releases/download/v21.12/protoc-21.12-linux-x86_64.zip
unzip protoc-21.12-linux-x86_64.zip

wget -q https://github.com/pganalyze/libpg_query/archive/refs/tags/16-5.0.0.zip
unzip 16-5.0.0.zip

rm -rv $PROJECT_DIR/src/main/java/com/premiumminds/sonar/postgres/protobuf/

echo 'option java_multiple_files = true;' >> libpg_query-16-5.0.0/protobuf/pg_query.proto
echo 'option java_package = "com.premiumminds.sonar.postgres.protobuf";' >> libpg_query-16-5.0.0/protobuf/pg_query.proto

bin/protoc \
    --java_out=$PROJECT_DIR/src/main/java \
    --proto_path=libpg_query-16-5.0.0/protobuf/ \
    libpg_query-16-5.0.0/protobuf/pg_query.proto

patch -p1 --directory=$PROJECT_DIR < $PROJECT_DIR/Token.java.patch

docker rm -f gcc-libpgquery-amd64 gcc-libpgquery-aarch64
popd
chmod -R +w $LIBPG_QUERY_TEMP_DIR
rm -r $LIBPG_QUERY_TEMP_DIR


