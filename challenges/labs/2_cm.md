# Install CM 5.9.x 

 1. List the command and output for ls /etc/yum.repos.d

    ```
    $ ls /etc/yum.repos.d
    CentOS-Base.repo  CentOS-Debuginfo.repo  CentOS-Media.repo  CentOS-Vault.repo  CentOS-fasttrack.repo  cloudera-manager.repo  mysql-community-source.repo  mysql-community.repo
    $
    ```

 1. scm_prepare_database.sh

    ```
    $ /usr/share/cmf/schema/scm_prepare_database.sh mysql -h ip-172-31-25-131.eu-west-1.compute.internal --scm-host $ip-172-31-17-225.eu-west-1.compute.internal scm scm password
    JAVA_HOME=/usr/java/jdk1.7.0_67-cloudera
    Verifying that we can write to /etc/cloudera-scm-server
    Creating SCM configuration file in /etc/cloudera-scm-server
    Executing:  /usr/java/jdk1.7.0_67-cloudera/bin/java -cp /usr/share/java/mysql-connector-java.jar:/usr/share/java/oracle-connector-java.jar:/usr/share/cmf/schema/../lib/* com.cloudera.enterprise.dbutil.DbCommandExecutor /etc/cloudera-scm-server/db.properties com.cloudera.cmf.db.
    log4j:ERROR Could not find value for key log4j.appender.A
    log4j:ERROR Could not instantiate appender named "A".
    [2017-03-10 08:42:19,493] INFO     0[main] - com.cloudera.enterprise.dbutil.DbCommandExecutor.testDbConnection(DbCommandExecutor.java) - Successfully connected to database.
    All done, your SCM database is configured correctly!
    $
    ```






    