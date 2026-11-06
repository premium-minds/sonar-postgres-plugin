== problem

Using ``character`` is likely a mistake and should almost always be replaced by ``text`` or ``varchar``.

From the [postgres docs](https://www.postgresql.org/docs/10/datatype-character.html):

> There is no performance difference among these three types, apart from increased storage space when using the blank-padded type, and a few extra CPU cycles to check the length when storing into a length-constrained column. While character(n) has performance advantages in some other database systems, there is no such advantage in PostgreSQL; in fact character(n) is usually the slowest of the three because of its additional storage costs. In most situations text or character varying should be used instead.

See the rule ``prefer-text-field`` rule for info on the advantages of ``text`` over ``varchar``.

[Don't Do This - Don't use char(n)](https://wiki.postgresql.org/wiki/Don't_Do_This#Don.27t_use_char.28n.29)

== solution

Use ``text`` or ``varchar`` instad of ``character``.

Instead of:

``sql
CREATE TABLE "app_user" (
    "id" serial NOT NULL PRIMARY KEY,
    "name" char(100) NOT NULL,
    "email" character NOT NULL,
);
``

Use:

``sql
CREATE TABLE "app_user" (
    "id" serial NOT NULL PRIMARY KEY,
    "name" varchar(100) NOT NULL,
    "email" TEXT NOT NULL,
);
``
