# Security Lab
## Enabling Sentry as a Service

 1. Add your test user's primary group to the sentry.service.admin.group list in CM

    1. Go to Sentry -> Configurations -> click + on any fo the groups
    1. Add, in this case, joseluisvf to the groups (we can find the group by su - joseluisvf; ip;)


    
 1. Verify user privileges(use beeline to confirm your principal sees no tables)

    ```
    $ kinit joseluisvf
    Password for joseluisvf@JOSELUISVF.COM:
    $ beeline
    $ beeline>!connect jdbc:hive2://localhost:10000/default;principal=hive/ip-172-31-18-176.eu-west-1.compute.internal@REALM.COM
    $ 0: jdbc:hive2://localhost:10000/default> show tables;
    INFO  : Compiling command(queryId=hive_20170309101313_1d1688b5-e7dc-4a50-b1f0-02719f8865e0): show tables
    INFO  : Semantic Analysis Completed
    INFO  : Returning Hive schema: Schema(fieldSchemas:[FieldSchema(name:tab_name, type:string, comment:from deserializer)], properties:null)
    INFO  : Completed compiling command(queryId=hive_20170309101313_1d1688b5-e7dc-4a50-b1f0-02719f8865e0); Time taken: 0.944 seconds
    INFO  : Executing command(queryId=hive_20170309101313_1d1688b5-e7dc-4a50-b1f0-02719f8865e0): show tables
    INFO  : Starting task [Stage-0:DDL] in serial mode
    INFO  : Completed executing command(queryId=hive_20170309101313_1d1688b5-e7dc-4a50-b1f0-02719f8865e0); Time taken: 0.337 seconds
    INFO  : OK
    +-----------+--+
    | tab_name  |
    +-----------+--+
    +-----------+--+
    No rows selected (1.698 seconds)
    ``` 
    
 1. kinit as george and ferdinand, then login to beeline

    ```
    $ kinit george
    Password for george@JOSELUISVF.COM:
    [root@ip-172-31-18-176 ~]# beeline
    Beeline version 1.1.0-cdh5.8.4 by Apache Hive
    beeline> !connect jdbc:hive2://localhost:10000/default;principal=hive/ip-172-31-18-176.eu-west-1.compute.internal@REALM.COM
    scan complete in 3ms
    Connecting to jdbc:hive2://localhost:10000/default;principal=hive/ip-172-31-18-176.eu-west-1.compute.internal@REALM.COM
    Enter username for jdbc:hive2://localhost:10000/default;principal=hive/ip-172-31-18-176.eu-west-1.compute.internal@REALM.COM:
    Enter password for jdbc:hive2://localhost:10000/default;principal=hive/ip-172-31-18-176.eu-west-1.compute.internal@REALM.COM:
    Connected to: Apache Hive (version 1.1.0-cdh5.8.4)
    Driver: Hive JDBC (version 1.1.0-cdh5.8.4)
    Transaction isolation: TRANSACTION_REPEATABLE_READ
    0: jdbc:hive2://localhost:10000/default> show tables;
    INFO  : Compiling command(queryId=hive_20170309102727_78c3fd23-c4b9-4655-85a2-37a3f3d512eb): show tables
    INFO  : Semantic Analysis Completed
    INFO  : Returning Hive schema: Schema(fieldSchemas:[FieldSchema(name:tab_name, type:string, comment:from deserializer)], properties:null)
    INFO  : Completed compiling command(queryId=hive_20170309102727_78c3fd23-c4b9-4655-85a2-37a3f3d512eb); Time taken: 0.071 seconds
    INFO  : Executing command(queryId=hive_20170309102727_78c3fd23-c4b9-4655-85a2-37a3f3d512eb): show tables
    INFO  : Starting task [Stage-0:DDL] in serial mode
    INFO  : Completed executing command(queryId=hive_20170309102727_78c3fd23-c4b9-4655-85a2-37a3f3d512eb); Time taken: 0.139 seconds
    INFO  : OK
    +------------+--+
    |  tab_name  |
    +------------+--+
    | customers  |
    | sample_07  |
    | sample_08  |
    | web_logs   |
    +------------+--+
    4 rows selected (0.342 seconds)
    0: jdbc:hive2://localhost:10000/default> q!
    . . . . . . . . . . . . . . . . . . . .> ;
    Error: Error while compiling statement: FAILED: ParseException line 1:0 cannot recognize input near 'q' '!' '<EOF>' (state=42000,code=40000)
    0: jdbc:hive2://localhost:10000/default> !q
    Closing: 0: jdbc:hive2://localhost:10000/default;principal=hive/ip-172-31-18-176.eu-west-1.compute.internal@REALM.COM
    [root@ip-172-31-18-176 ~]# kinit ferdinand
    Password for ferdinand@JOSELUISVF.COM:
    [root@ip-172-31-18-176 ~]# beeline
    Beeline version 1.1.0-cdh5.8.4 by Apache Hive
    beeline> !connect jdbc:hive2://localhost:10000/default;principal=hive/ip-172-31-18-176.eu-west-1.compute.internal@REALM.COM
    scan complete in 3ms
    Connecting to jdbc:hive2://localhost:10000/default;principal=hive/ip-172-31-18-176.eu-west-1.compute.internal@REALM.COM
    Enter username for jdbc:hive2://localhost:10000/default;principal=hive/ip-172-31-18-176.eu-west-1.compute.internal@REALM.COM:
    Enter password for jdbc:hive2://localhost:10000/default;principal=hive/ip-172-31-18-176.eu-west-1.compute.internal@REALM.COM:
    Connected to: Apache Hive (version 1.1.0-cdh5.8.4)
    Driver: Hive JDBC (version 1.1.0-cdh5.8.4)
    Transaction isolation: TRANSACTION_REPEATABLE_READ
    0: jdbc:hive2://localhost:10000/default> show tables;
    INFO  : Compiling command(queryId=hive_20170309102828_9e578302-d027-48c1-9ad6-3fc59a97de8e): show tables
    INFO  : Semantic Analysis Completed
    INFO  : Returning Hive schema: Schema(fieldSchemas:[FieldSchema(name:tab_name, type:string, comment:from deserializer)], properties:null)
    INFO  : Completed compiling command(queryId=hive_20170309102828_9e578302-d027-48c1-9ad6-3fc59a97de8e); Time taken: 0.07 seconds
    INFO  : Executing command(queryId=hive_20170309102828_9e578302-d027-48c1-9ad6-3fc59a97de8e): show tables
    INFO  : Starting task [Stage-0:DDL] in serial mode
    INFO  : Completed executing command(queryId=hive_20170309102828_9e578302-d027-48c1-9ad6-3fc59a97de8e); Time taken: 0.137 seconds
    INFO  : OK
    +------------+--+
    |  tab_name  |
    +------------+--+
    | sample_07  |
    +------------+--+
    1 row selected (0.344 seconds)
    $
    $
    ``` 
        
