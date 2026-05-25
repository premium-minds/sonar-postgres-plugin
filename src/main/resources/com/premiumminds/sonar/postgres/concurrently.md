== problem

During a normal index creation, table updates are blocked, but reads are still allowed. `CONCURRENTLY` avoids locking the table against writes during index creation.

https://www.postgresql.org/docs/current/sql-createindex.html#SQL-CREATEINDEX-CONCURRENTLY

== solution

Ensure all index creations use the ``CONCURRENTLY`` option.

=== create index

Instead of:

``sql
CREATE INDEX "email_idx" ON "app_user" ("email");
``

Use:

``sql
CREATE INDEX CONCURRENTLY "email_idx" ON "app_user" ("email");
``

=== drop index

Instead of:

``sql
DROP INDEX "email_idx" ON "app_user" ("email");
``

Use:

``sql
DROP INDEX CONCURRENTLY "email_idx" ON "app_user" ("email");
``