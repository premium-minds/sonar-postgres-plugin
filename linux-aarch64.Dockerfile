# to make compiled artifacts compatible with GLIBC_2.31 used in Ubuntu 22.04
FROM ubuntu:22.04
RUN --mount=type=cache,target=/var/cache/apt,sharing=locked \
  --mount=type=cache,target=/var/lib/apt,sharing=locked \
  apt-get update && apt-get install -y --no-install-recommends build-essential gcc-aarch64-linux-gnu libc6-dev-arm64-cross

WORKDIR /work
ADD \
  --checksum=sha256:2d3486cf6a9d3955b53e66235db39d62b54216c820cd392ab66dc842c5b1316d \
  https://github.com/pganalyze/libpg_query/archive/refs/tags/18.1.0.tar.gz /work
RUN tar -zx --strip-components=1 -f 18.1.0.tar.gz
RUN make CC=aarch64-linux-gnu-gcc -j build_shared
