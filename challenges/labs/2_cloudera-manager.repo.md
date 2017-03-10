# Install CM 5.9.x 


 1. Copy the cloudera-manager.repo file

    ```
    $ cat /etc/yum.repos.d/cloudera-manager.repo
    [cloudera-manager]
    name=Cloudera Manager
    baseurl=https://archive.cloudera.com/cm5/redhat/6/x86_64/cm/5.9.1/
    gpgkey =https://archive.cloudera.com/cm5/redhat/6/x86_64/cm/RPM-GPG-KEY-cloudera
    gpgcheck = 1
    $
    ```