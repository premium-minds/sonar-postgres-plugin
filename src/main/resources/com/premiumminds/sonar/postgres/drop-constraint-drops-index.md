
Dropping a primary or unique constraint also drops any index underlying the constraint. 

This index could be in use by the application and dropping it could lead to very bad query performance and high application latency 

== solutions 

 - Add a duplicate index (concurrently) before dropping the constraint. 
 - Confirm that the underlying index is not in use. 
