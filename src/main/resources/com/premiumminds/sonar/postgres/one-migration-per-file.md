== problem

Multiple migrations in the same file could lead to deadlocks if there is a single transaction for all migrations.

It can also prolong the life of locks obtained in earlier commands until the transaction finishes.

== solution

Use multiple files for multiple migrations.
