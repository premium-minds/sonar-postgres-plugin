== problem

``
create unique index concurrently if not exists idx_foo_id_hash on foo using hash(id);
ERROR:  access method "hash" does not support unique indexes
``

Currently, only B-tree indexes can be declared unique.

 - [Unique Indexes](https://www.postgresql.org/docs/18/indexes-unique.html)
