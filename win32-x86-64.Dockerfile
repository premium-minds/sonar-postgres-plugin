FROM gcc:16.1
RUN apt update
WORKDIR /work
ADD \
  --checksum=sha256:6ad7783f272acfd116455c66a03298a0cac9a9168281df547969219112f0260f \
  https://github.com/pganalyze/libpg_query/archive/refs/tags/18.0.0.tar.gz /work
RUN tar -zx --strip-components=1 -f 18.0.0.tar.gz
RUN apt install -y gcc-mingw-w64-x86-64-win32 mingw-w64-x86-64-dev mingw-w64-common
RUN make CC=x86_64-w64-mingw32-gcc -j build_shared OS=Windows_NT