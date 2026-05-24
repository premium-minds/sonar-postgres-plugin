FROM gcc:16.1
RUN apt update
WORKDIR /work
ADD \
  --checksum=sha256:6ad7783f272acfd116455c66a03298a0cac9a9168281df547969219112f0260f \
  https://github.com/pganalyze/libpg_query/archive/refs/tags/18.0.0.tar.gz /work
RUN tar -zx --strip-components=1 -f 18.0.0.tar.gz
RUN make -j build_shared
