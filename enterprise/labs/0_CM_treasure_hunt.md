# CM Monitoring Lab

 * What is ubertask optimization?
 ```
 If the job is small, the application master may choose to run the tasks in the same JVM as itself. This happens when it judges that the overhead of allocating and running tasks in new containers outweighs the gain to be had in running them in parallel, compared to running them sequentially on one node. Such a job is said to be uberized, or run as an uber task. What qualifies as a small job? By default, a small job is one that has less than 10 mappers, only one reducer, and an input size that is less than the size of one HDFS block.
 ```

 * Where in CM is the Kerberos Security Realm value displayed?
 ```
 (on CM) 
 'Administration' -> 'Settings' -> (on sidebar) 'Kerberos' property
 ```
 
 * Which CDH service(s) host a property for enabling Kerberos authentication?
 ```
 Even though on the search only HDFS and Zookeeper host an option to enable this, from the hadoop documentation
 it is stated that "By configuring Hadoop runs in secure mode, each user and service needs to be authenticated by Kerberos in order to use Hadoop services.", by which it can be deduced that 
 -> Each service has a way of enabling Kerberos authentication.
 ```
 [(source)](https://hadoop.apache.org/docs/r2.7.2/hadoop-project-dist/hadoop-common/SecureMode.html)

 * How do you upgrade the CM agents?
 ```
 You can use an upgrade wizard that is invoked when you connect to the Admin Console or manually install the Cloudera Manager Agent packages
 ```
 [(source)](https://www.cloudera.com/documentation/enterprise/5-5-x/topics/cm_ag_upgrading_cm.html)

 * Give the tsquery statement used to chart Hue's CPU utilization?
 ```
 SELECT stats(cpu_user_rate, counter) + stats(cpu_system_rate, counter) WHERE roleType=HUE_SERVER
 ```

 * Name all the roles that make up the Hive service
 ```
 Hive metastore server, webhcat server, gateway, hiveserver2
 ```

 * What steps must be completed before integrating Cloudera Manager with Kerberos?
 ```
 Enabling Kerberos Authentication Using the Wizard 
 
  * Step 1: Install Cloudera Manager and CDH 
  * Step 2: If You are Using AES-256 Encryption, Install the JCE Policy File Step 
  * 3: Get or Create a Kerberos Principal for the Cloudera Manager Server * Step 4: Enabling Kerberos Using the Wizard 
  * Step 5: Create the HDFS Superuser 
  * Step 6: Get or Create a Kerberos Principal for Each User Account 
  * Step 7: Prepare the Cluster for Each User 
  * Step 8: Verify that Kerberos Security is Working 
  * Step 9: (Optional) Enable Authentication for HTTP Web Consoles for Hadoop Roles
 ```

 [(source)](https://www.cloudera.com/documentation/enterprise/5-8-x/topics/cm_sg_intro_kerb.html)    