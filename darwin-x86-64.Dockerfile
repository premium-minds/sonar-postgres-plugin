# syntax=docker/dockerfile:1

ARG OSXCROSS_VERSION=26.1
FROM --platform=$BUILDPLATFORM crazymax/osxcross:${OSXCROSS_VERSION}-ubuntu AS osxcross

FROM ubuntu:24.04
RUN --mount=type=cache,target=/var/cache/apt,sharing=locked \
  --mount=type=cache,target=/var/lib/apt,sharing=locked \
  apt-get update && apt-get install -y --no-install-recommends clang build-essential
ENV PATH="/osxcross/bin:$PATH"
ENV LD_LIBRARY_PATH="/osxcross/lib:$LD_LIBRARY_PATH"
COPY --link --from=osxcross /osxcross /osxcross

WORKDIR /work
ADD \
  --checksum=sha256:2d3486cf6a9d3955b53e66235db39d62b54216c820cd392ab66dc842c5b1316d \
  https://github.com/pganalyze/libpg_query/archive/refs/tags/18.1.0.tar.gz /work
RUN tar -zx --strip-components=1 -f 18.1.0.tar.gz
COPY darwin.patch /work/darwin.patch

RUN patch -p1 < /work/darwin.patch
RUN make CC=o64-clang -j build_shared
