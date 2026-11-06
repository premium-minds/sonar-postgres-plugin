== problem

A non-robust migration that fails after partially applying may fail again when retried.

=== example

You may have a migration with two steps:

1. add new column named ``billing_email`` to the ``account`` table.
2. create index ``CONCURRENTLY`` on ``billing_email``.

Since step 2 is concurrent, we cannot run this migration in a transaction.

Without a transaction, step 1 can succeed while step 2 fails. This would leave us with the new ``billing_email`` column, but without the index from step 2.

When we rerun our migration, the migration will fail at step 1, since the field ``billing_email`` field already exists.

To make this change robust, we can follow the *add column* and *add index* examples shown below and use ``IF NOT EXISTS`` when adding our column and index.

With this change, we can run our migration multiple times without erroring.

== solutions

To appease this rule you can use guards like ``IF NOT EXISTS`` or wrap all your statements in a transaction.

=== add table

``sql
-- instead of:
CREATE TABLE "foo_tbl" (
    "id" serial NOT NULL PRIMARY KEY,
    "modified" timestamp with time zone NOT NULL,
    "created" timestamp with time zone NOT NULL
);

-- use:
CREATE TABLE IF NOT EXISTS "foo_tbl" (
    "id" serial NOT NULL PRIMARY KEY,
    "modified" timestamp with time zone NOT NULL,
    "created" timestamp with time zone NOT NULL
);
``

=== add column

``sql
-- instead of:
ALTER TABLE "app_user" ADD COLUMN "email" integer NULL;

-- use:
ALTER TABLE "app_user" ADD COLUMN "email" IF NOT EXISTS integer NULL;
``

=== add constraint

``sql
-- instead of:
ALTER TABLE "app_user" ADD "email_constraint";

-- use:
ALTER TABLE "app_user" DROP CONSTRAINT IF EXISTS "email_constraint";
ALTER TABLE "app_user" ADD "email_constraint";
``

=== add index

``sql
-- instead of:
CREATE INDEX CONCURRENTLY "email_idx" ON "app_user" ("email");

-- use:
CREATE INDEX CONCURRENTLY IF NOT EXISTS "email_idx" ON "app_user" ("email");
``

=== add sequence

``sql
-- instead of:
CREATE SEQUENCE foo START 101;

-- use:
CREATE SEQUENCE IF NOT EXISTS foo START 101;
``

=== add schema

``sql
-- instead of:
CREATE SCHEMA foo;

-- use:
CREATE SCHEMA IF NOT EXISTS foo;
``

=== add materialized view

``sql
-- instead of:
CREATE MATERIALIZED VIEW foo AS SELECT 1;

-- use:
CREATE MATERIALIZED VIEW IF NOT EXISTS foo AS SELECT 1;
``

=== add function

``sql
-- instead of:
CREATE FUNCTION add(integer, integer) RETURNS integer AS 'select $1 + $2;' LANGUAGE SQL;

-- use:
CREATE OR REPLACE FUNCTION add(integer, integer) RETURNS integer AS 'select $1 + $2;' LANGUAGE SQL;
``

=== alter sequence

``sql
-- instead of:
ALTER SEQUENCE foo RESTART WITH 105;

-- use:
ALTER SEQUENCE IF EXISTS foo RESTART WITH 105;
``

=== alter view

``sql
-- instead of:
ALTER VIEW foo RENAME TO bar;

-- use:
ALTER VIEW IF EXISTS foo RENAME TO bar;
``

=== alter materialized view

``sql
-- instead of:
ALTER MATERIALIZED VIEW foo RENAME TO bar;

-- use:
ALTER MATERIALIZED VIEW IF EXISTS foo RENAME TO bar;
``

=== remove table

``sql
-- instead of:
DROP TABLE "foo_tbl";

-- use:
DROP TABLE IF EXISTS "foo_tbl";
``

=== remove column

``sql
-- instead of:
ALTER TABLE "app_user" DROP COLUMN "col_name";

-- use:
ALTER TABLE "app_user" DROP COLUMN IF EXISTS "col_name";
``

=== remove constraint

``sql
-- instead of:
ALTER TABLE "foo_tbl" DROP CONSTRAINT "foo_constraint";

-- use:
ALTER TABLE "foo_tbl" DROP CONSTRAINT IF EXISTS "foo_constraint";
``

``sql
-- instead of:
ALTER DOMAIN us_postal_code DROP CONSTRAINT zipchk;

-- use:
ALTER DOMAIN us_postal_code DROP CONSTRAINT IF EXISTS zipchk;
``

=== remove index

``sql
-- instead of:
DROP INDEX "foo_idx";

-- use:
DROP INDEX IF EXISTS "foo_idx";
``

=== drop sequence

``sql
-- instead of:
DROP SEQUENCE foo;

-- use:
DROP SEQUENCE IF EXISTS foo;
``

=== drop view

``sql
-- instead of:
DROP VIEW foo;

-- use:
DROP VIEW IF EXISTS foo;
``

=== drop materialized view

``sql
-- instead of:
DROP MATERIALIZED VIEW foo;

-- use:
DROP MATERIALIZED VIEW IF EXISTS foo;
``

=== drop schema

``sql
-- instead of:
DROP SCHEMA foo;

-- use:
DROP SCHEMA IF EXISTS foo;
``

=== drop domain

``sql
-- instead of:
DROP DOMAIN foo;

-- use:
DROP DOMAIN IF EXISTS foo;
``
