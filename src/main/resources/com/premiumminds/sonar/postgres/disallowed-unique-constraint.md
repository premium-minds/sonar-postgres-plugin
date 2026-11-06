== problem

Adding a ``UNIQUE`` constraint requires an ``ACCESS EXCLUSIVE`` lock which blocks reads and writes to the table while the index is built.


== solution

Instead, create an index ``CONCURRENTLY`` and create the ``CONSTRAINT`` ``USING`` the index.

[ALTER TABLE](https://www.postgresql.org/docs/current/sql-altertable.html)

Instead of:

``sql
ALTER TABLE table_name ADD CONSTRAINT field_name_constraint UNIQUE (field_name);
``

Use:

``sql
CREATE UNIQUE INDEX CONCURRENTLY dist_id_temp_idx ON distributors (dist_id);
ALTER TABLE distributors
    DROP CONSTRAINT distributors_unique_constraint,
    ADD CONSTRAINT distributors_unique_constraint UNIQUE USING INDEX dist_id_temp_idx;
``
