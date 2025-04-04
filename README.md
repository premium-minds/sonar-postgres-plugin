# sonar-postgres-plugin

Sonar plugin to analyze Postgres SQL scripts

## Screenshot

![issue example](screenshot.png).

## Build

Check [BUILDING.md](BUILDING.md)

## Rules

 * [adding-field-with-default](src/main/resources/com/premiumminds/sonar/postgres/adding-field-with-default.md)
 * [adding-foreign-key-constraint](src/main/resources/com/premiumminds/sonar/postgres/adding-foreign-key-constraint.md)
 * [adding-serial-primary-key-field](src/main/resources/com/premiumminds/sonar/postgres/adding-serial-primary-key-field.md)
 * [ban-char-field](src/main/resources/com/premiumminds/sonar/postgres/ban-char-field.md)
 * [ban-drop-database](src/main/resources/com/premiumminds/sonar/postgres/ban-drop-database.md)
 * [ban-alter-domain-with-add-constraint](src/main/resources/com/premiumminds/sonar/postgres/ban-alter-domain-with-add-constraint.md)
 * [ban-create-domain-with-constraint](src/main/resources/com/premiumminds/sonar/postgres/ban-create-domain-with-constraint.md)
 * [changing-column-type](src/main/resources/com/premiumminds/sonar/postgres/changing-column-type.md)
 * [cluster](src/main/resources/com/premiumminds/sonar/postgres/cluster.md)
 * [concurrently](src/main/resources/com/premiumminds/sonar/postgres/concurrently.md)
 * [constraint-missing-not-valid](src/main/resources/com/premiumminds/sonar/postgres/constraint-missing-not-valid.md)
 * [disallowed-do](src/main/resources/com/premiumminds/sonar/postgres/disallowed-do.md)
 * [disallowed-unique-constraint](src/main/resources/com/premiumminds/sonar/postgres/disallowed-unique-constraint.md)
 * [drop-constraint-drops-index](src/main/resources/com/premiumminds/sonar/postgres/drop-constraint-drops-index.md)
 * [identifier-max-length](src/main/resources/com/premiumminds/sonar/postgres/identifier-max-length.md)
 * [one-migration-per-file](src/main/resources/com/premiumminds/sonar/postgres/one-migration-per-file.md)
 * [only-lower-case-names](src/main/resources/com/premiumminds/sonar/postgres/only-lower-case-names.md)
 * [only-schema-migrations](src/main/resources/com/premiumminds/sonar/postgres/only-schema-migrations.md)
 * [parse-error](src/main/resources/com/premiumminds/sonar/postgres/parse-error.md)
 * [prefer-identity-field](src/main/resources/com/premiumminds/sonar/postgres/prefer-identity-field.md)
 * [prefer-robust-stmts](src/main/resources/com/premiumminds/sonar/postgres/prefer-robust-stmts.md)
 * [prefer-text-field](src/main/resources/com/premiumminds/sonar/postgres/prefer-text-field.md)
 * [renaming-column](src/main/resources/com/premiumminds/sonar/postgres/renaming-column.md)
 * [renaming-table](src/main/resources/com/premiumminds/sonar/postgres/renaming-table.md)
 * [setting-not-nullable-field](src/main/resources/com/premiumminds/sonar/postgres/setting-not-nullable-field.md)
 * [vacuum-full](src/main/resources/com/premiumminds/sonar/postgres/vacuum-full.md)

## Acknowledgements
 * [Squawk](https://squawkhq.com/)
