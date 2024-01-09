# syntax=docker/dockerfile:1

ARG OSXCROSS_VERSION=latest
FROM --platform=$BUILDPLATFORM crazymax/osxcross:${OSXCROSS_VERSION}-ubuntu AS osxcross

FROM ubuntu
RUN apt-get update && apt-get install -y clang lld libc6-dev wget unzip build-essential
ENV PATH="/osxcross/bin:$PATH"
ENV LD_LIBRARY_PATH="/osxcross/lib:$LD_LIBRARY_PATH"
COPY --link --from=osxcross /osxcross /osxcross
