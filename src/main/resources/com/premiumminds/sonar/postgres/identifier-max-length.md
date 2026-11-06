
Generates an issue if any identifier is greater than the default Postgresql limit of 63 bytes.

[PostgreSQL's Max Identifier Length Is 63 Bytes](https://til.hashrocket.com/posts/8f87c65a0a-postgresqls-max-identifier-length-is-63-bytes)

== problem

Postgresql truncates all identifiers. By default this value is 63 bytes.

For example, this migration would only create a single table named ``a23456789_123456789_123456789_123456789_123456789_123456789_123`` against the developer expectations: 

``
CREATE TABLE IF NOT EXISTS a23456789_123456789_123456789_123456789_123456789_123456789_123456789_v1 (
    id int PRIMARY key,
    name text
);

CREATE TABLE IF NOT EXISTS a23456789_123456789_123456789_123456789_123456789_123456789_123456789_v2 (
    id int PRIMARY key,
    email text
);
``
