
== problem 

Running VACUUM FULL exclusively locks the table while running.

== solution 

Use [pg_repack](https://github.com/reorg/pg_repack) to reorganize tables in PostgreSQL databases with minimal locks.
