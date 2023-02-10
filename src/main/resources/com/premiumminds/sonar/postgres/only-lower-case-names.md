== problem

Don't use NamesLikeThis, use names_like_this.

PostgreSQL folds all names - of tables, columns, functions and everything else - to lower case unless they're "double quoted".

So create table Foo() will create a table called foo, while create table "Bar"() will create a table called Bar.

These select commands will work: select * from Foo, select * from foo, select * from "Bar".

These will fail with "no such table": select * from "Foo", select * from Bar, select * from bar.

This means that if you use uppercase characters in your table or column names you have to either always double quote them or never double quote them. That's annoying enough by hand, but when you start using other tools to access the database, some of which always quote all names and some don't, it gets very confusing.

Stick to using a-z, 0-9 and underscore for names and you never have to worry about quoting them.

== links

* [Don't Do This - Don't use upper case table or column names](https://wiki.postgresql.org/wiki/Don%27t_Do_This#Don.27t_use_upper_case_table_or_column_names)