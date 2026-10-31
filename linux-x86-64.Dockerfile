FROM gcc:16.1
RUN apt update
WORKDIR /work
ADD \
  --checksum=sha256:2d3486cf6a9d3955b53e66235db39d62b54216c820cd392ab66dc842c5b1316d \
  https://github.com/pganalyze/libpg_query/archive/refs/tags/18.1.0.tar.gz /work
RUN tar -zx --strip-components=1 -f 18.1.0.tar.gz
RUN make -j build_shared
