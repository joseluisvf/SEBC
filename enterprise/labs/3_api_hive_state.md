# CM Lab
## Use the API

 1. Stopping Hive
    ```
    $ curl -u 'joseluisvf:cloudera' -X POST "http://ip-172-31-20-167.eu-west-1.compute.internal:7180/api/v12/clusters/joseluisvf/services/hive/commands/stop"
    {
     "id" : 374,
     "name" : "Stop",
     "startTime" : "2017-03-08T09:13:06.997Z",
     "active" : true,
     "serviceRef" : {
       "clusterName" : "cluster",
       "serviceName" : "hive"
     }
    }
    $ 
    ```
 1. Checking Hive actually stopped
    ```
    $ curl -u 'joseluisvf:cloudera' -X GET "http://ip-172-31-20-167.eu-west-1.compute.internal:7180/api/v12/clusters/joseluisvf/services/hive"
    {
     "name" : "hive",
     "type" : "HIVE",
     "clusterRef" : {
       "clusterName" : "cluster"
     },
     "serviceUrl" : "http://ip-172-31-20-167.eu-west-1.compute.internal:7180/cmf/serviceRedirect/hive",
     "roleInstancesUrl" : "http://ip-172-31-20-167.eu-west-1.compute.internal:7180/cmf/serviceRedirect/hive/instances",
     "serviceState" : "STOPPED",
     "healthSummary" : "DISABLED",
     "healthChecks" : [ {
       "name" : "HIVE_HIVEMETASTORES_HEALTHY",
       "summary" : "DISABLED",
       "suppressed" : false
     }, {
       "name" : "HIVE_HIVESERVER2S_HEALTHY",
       "summary" : "DISABLED",
       "suppressed" : false
     } ],
     "configStalenessStatus" : "FRESH",
     "clientConfigStalenessStatus" : "FRESH",
     "maintenanceMode" : false,
     "maintenanceOwners" : [ ],
     "displayName" : "Hive",
     "entityStatus" : "STOPPED"
    }
    $ 
    ```
 1. Starting Hive
    ```
    $ curl -u 'joseluisvf:cloudera' -X POST "http://ip-172-31-20-167.eu-west-1.compute.internal:7180/api/v12/clusters/joseluisvf/services/hive/commands/start"
    {
     "id" : 378,
     "name" : "Start",
     "startTime" : "2017-03-08T09:32:48.962Z",
     "active" : true,
     "serviceRef" : {
       "clusterName" : "cluster",
       "serviceName" : "hive"
     }
    }
    $
    ```
 1. Checking Hive actually started 
    ```
    $ curl -u 'joseluisvf:cloudera' -X GET "http://ip-172-31-20-167.eu-west-1.compute.internal:7180/api/v12/clusters/joseluisvf/services/hive"
    {
     "name" : "hive",
     "type" : "HIVE",
     "clusterRef" : {
       "clusterName" : "cluster"
     },
     "serviceUrl" : "http://ip-172-31-20-167.eu-west-1.compute.internal:7180/cmf/serviceRedirect/hive",
     "roleInstancesUrl" : "http://ip-172-31-20-167.eu-west-1.compute.internal:7180/cmf/serviceRedirect/hive/instances",
     "serviceState" : "STARTED",
     "healthSummary" : "GOOD",
     "healthChecks" : [ {
       "name" : "HIVE_HIVEMETASTORES_HEALTHY",
       "summary" : "GOOD",
       "suppressed" : false
     }, {
       "name" : "HIVE_HIVESERVER2S_HEALTHY",
       "summary" : "GOOD",
       "suppressed" : false
     } ],
     "configStalenessStatus" : "FRESH",
     "clientConfigStalenessStatus" : "FRESH",
     "maintenanceMode" : false,
     "maintenanceOwners" : [ ],
     "displayName" : "Hive",
     "entityStatus" : "GOOD_HEALTH"
    }
    $
    ```
   
   
   
   
   
