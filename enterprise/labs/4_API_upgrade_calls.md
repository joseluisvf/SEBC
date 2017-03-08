# CM Monitoring Lab
## Upgrade Cloudera Manager

 1. Report the latest available version of the API

    ```
    $ curl -u 'joseluisvf:cloudera' http://ip-172-31-20-167.eu-west-1.compute.internal:7180/api/version
    $ v15
    $
    ```
 1. Report the CM version

    ```
    $ curl -u 'joseluisvf:cloudera' http://ip-172-31-20-167.eu-west-1.compute.internal:7180/api/v15/cm/version
    {
    "version" : "5.10.0",
    "buildUser" : "jenkins",
    "buildTimestamp" : "20170120-1038",
    "gitHash" : "aa0b5cd5eceaefe2f971c13ab657020d96bb842a",
    "snapshot" : false
    }
    $ 
    ```

 1. List all CM users

    ```
    $ curl -u 'joseluisvf:cloudera' http://ip-172-31-20-167.eu-west-1.compute.internal:7180/api/v15/users
    {
    "items" : [ {
    "name" : "admin",
    "roles" : [ "ROLE_LIMITED" ]
    }, {
    "name" : "joseluisvf",
    "roles" : [ "ROLE_ADMIN" ]
    }, {
    "name" : "minotaur",
    "roles" : [ "ROLE_CONFIGURATOR" ]
    } ]
    }
    $ 
    ```

 1. Report the database server in use by CM

    ```
    $ curl -u 'joseluisvf:cloudera' http://ip-172-31-28-81.eu-west-1.compute.internal:7180/api/v15/cm/scmDbInfo
    {
    "scmDbType" : "MYSQL",
    "embeddedDbUsed" : false
    } 
    $
    ```

