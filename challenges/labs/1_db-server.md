# Challenge
# Install MySQL

 1. The hostname of your db server node

    ```
    $ hostname -f
    $ ip-172-31-25-131.eu-west-1.compute.internal
    $ 
    ```

 1. MySQL Version

    ```
    $ mysql --version
    mysql  Ver 14.14 Distrib 5.6.35, for Linux (x86_64) using  EditLine wrapper
    $
    ```

 1. Install Cloudera Manager on a different node from MySQL

    ```
    $ mysql -u root -p -e "show databases;"
    Enter password:
    +--------------------+
    | Database           |
    +--------------------+
    | information_schema |
    | hive               |
    | hue                |
    | mysql              |
    | oozie              |
    | performance_schema |
    | rman               |
    | scm                |
    | sentry             |
    +--------------------+
    $
    ```

