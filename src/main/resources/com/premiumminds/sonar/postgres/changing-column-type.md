== problem

Changing a column type requires an ``ACCESS EXCLUSIVE`` lock on the table which blocks reads and writes while the table is rewritten.

Changing the type of the column may also break other clients reading from the table.

[ALTER TABLE](https://www.postgresql.org/docs/current/sql-altertable.html#SQL-ALTERTABLE-NOTES)


== solution

Some "binary coercible" types can be converted without a table rewrite.

``VARCHAR`` can safely be converted to ``TEXT`` and shorter ``VARCHAR(5)`` can be converted to longer ``VARCHAR(10)`` because they have the same binary representation on disk.

An ``INT`` (4 bytes wide) cannot be converted to a ``BIGINT`` (8 bytes wide) without rewriting the table.


=== convert an INT column to a BIGINT column

Consider a ``user_email`` table with a column ``user_id`` that we want to convert from ``INT`` to ``BIGINT``.

The general process is to add a new column, ``new_user_id``. Dual write with triggers. Backfill.

See ["Postgres Tips: How to convert 2 Billion Rows to Bigint with Citus"](https://techcommunity.microsoft.com/t5/azure-database-for-postgresql/postgres-tips-how-to-convert-2-billion-rows-to-bigint-with-citus/ba-p/1490128) for a detailed example.

=== convert an INT primary key to BIGINT

It's a complicated, multi-step process to convert columns that are primary keys or columns that have foreign key relations.


== further reading

Check ``castmethod`` column for ``b`` for "binary coercible" types:
```
SELECT castsource::regtype, casttarget::regtype, castfunc::regproc, castcontext, castmethod
FROM pg_catalog.pg_cast
ORDER BY castsource::regtype::TEXT, casttarget::regtype::text;
```

 - [pg_cast](https://www.postgresql.org/docs/current/catalog-pg-cast.html)
