# HDFS Lab
## Test HDFS Snapshots

 1. Create a precious directory in HDFS; copy the ZIP course file into it.

    ```
    $ sudo -u hdfs hdfs dfs -mkdir /precious/
    $ sudo -u hdfs hdfs dfs -put /tmp/SEBC.zip /precious/
    $ sudo -u hdfs hdfs dfs -ls /precious/
    Found 1 items
    -rw-r--r--   3 hdfs supergroup     415069 2017-03-07 11:15 /precious/SEBC.zip
    ```

 1. Enable snapshots for precious

    ```
    $ sudo -u hdfs hdfs dfsadmin -allowSnapshot /precious/
    Allowing snaphot on /precious/ succeeded
    $
    ```

 1. Create a snapshot called sebc-hdfs-test

    ```
    $ sudo -u hdfs hdfs dfs -createSnapshot /precious sebc-hdfs-test
    Created snapshot /precious/.snapshot/sebc-hdfs-test
    $ sudo -u hdfs hdfs dfs -ls /precious/.snapshot/sebc-hdfs-test
    Found 1 items
    -rw-r--r--   3 hdfs supergroup     415069 2017-03-07 11:15 /precious/.snapshot/sebc-hdfs-test/SEBC.zip
    $
    ```

 1. Delete the directory

    ```
    $ sudo -u hdfs hdfs dfs -rm -r /precious
    rm: Failed to move to trash: hdfs://ip-172-31-18-176.eu-west-1.compute.internal:8020/precious: The directory /precious cannot be deleted since /precious is snapshottable and already has snapshots
    $
    ```

 1. Delete the ZIP file

    ```
    $ sudo -u hdfs hdfs dfs -rm -f /precious/SEBC.zip
    17/03/07 11:18:44 INFO fs.TrashPolicyDefault: Moved: 'hdfs://ip-172-31-18-176.eu-west-1.compute.internal:8020/precious/SEBC.zip' to trash at: hdfs://ip-172-31-18-176.eu-west-1.compute.internal:8020/user/hdfs/.Trash/Current/precious/SEBC.zip
    $ sudo -u hdfs hdfs dfs -ls /precious
    $ 
    ```

 1. Restore the deleted file

    ```
    $ sudo -u hdfs hdfs dfs -cp /precious/.snapshot/sebc-hdfs-test/SEBC.zip /precious
    $ sudo -u hdfs hdfs dfs -ls /precious
    Found 1 items
    -rw-r--r--   3 hdfs supergroup     415069 2017-03-07 11:19 /precious/SEBC.zip
    ```