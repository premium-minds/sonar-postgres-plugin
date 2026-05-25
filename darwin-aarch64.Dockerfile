# syntax=docker/dockerfile:1

ARG OSXCROSS_VERSION=26.1
FROM --platform=$BUILDPLATFORM crazymax/osxcross:${OSXCROSS_VERSION}-ubuntu AS osxcross

FROM ubuntu:24.04
RUN --mount=type=cache,target=/var/cache/apt,sharing=locked \
  --mount=type=cache,target=/var/lib/apt,sharing=locked \
  apt update && apt-get install -y clang build-essential
ENV PATH="/osxcross/bin:$PATH"
ENV LD_LIBRARY_PATH="/osxcross/lib:$LD_LIBRARY_PATH"
COPY --link --from=osxcross /osxcross /osxcross

WORKDIR /work
ADD \
  --checksum=sha256:6ad7783f272acfd116455c66a03298a0cac9a9168281df547969219112f0260f \
  https://github.com/pganalyze/libpg_query/archive/refs/tags/18.0.0.tar.gz /work
RUN tar -zx --strip-components=1 -f 18.0.0.tar.gz
COPY darwin.patch /work/darwin.patch

RUN patch -p1 < /work/darwin.patch
RUN make CC=aarch64-apple-darwin25.1-cc -j build_shared
