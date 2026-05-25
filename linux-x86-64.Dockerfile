# to make compiled artifacts compatible with GLIBC_2.31 used in Ubuntu 22.04
FROM ubuntu:22.04
RUN --mount=type=cache,target=/var/cache/apt,sharing=locked \
  --mount=type=cache,target=/var/lib/apt,sharing=locked \
  apt-get update && apt-get install -y --no-install-recommends build-essential gcc-x86-64-linux-gnu

WORKDIR /work
ADD \
  --checksum=sha256:6ad7783f272acfd116455c66a03298a0cac9a9168281df547969219112f0260f \
  https://github.com/pganalyze/libpg_query/archive/refs/tags/18.0.0.tar.gz /work
RUN tar -zx --strip-components=1 -f 18.0.0.tar.gz
RUN make -j build_shared
