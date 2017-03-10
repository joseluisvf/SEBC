# Challenge
## Setup

1. List the cloud provider

    ```
    AWS
    ```
 
1. Nodes and IPs

    ```
    34.250.9.62     ec2-34-250-9-62.eu-west-1.compute.amazonaws.com     
    34.248.52.210   ec2-34-248-52-210.eu-west-1.compute.amazonaws.com   
    34.250.197.105  ec2-34-250-197-105.eu-west-1.compute.amazonaws.com  
    34.248.175.229  ec2-34-248-175-229.eu-west-1.compute.amazonaws.com  
    34.251.47.87    ec2-34-251-47-87.eu-west-1.compute.amazonaws.com    
    ```
 
1. List the Linux release you are using

    ```
    $ cat /etc/centos-release
    CentOS release 6.8 (Final)
    $ 
    ```
 
1. Demonstrate the disk capacity available on each node is >= 30 GB

    ```
    $ df -haT
    Filesystem     Type         Size  Used Avail Use% Mounted on
    /dev/xvde      ext4          79G  778M   74G   2% /
    proc           proc            0     0     0    - /proc
    sysfs          sysfs           0     0     0    - /sys
    devpts         devpts          0     0     0    - /dev/pts
    tmpfs          tmpfs        7.3G     0  7.3G   0% /dev/shm
    none           binfmt_misc     0     0     0    - /proc/sys/fs/binfmt_misc
    $ 
    ```

 1. List the command and output for yum repolist enabled
    
    ```
    $ yum repolist enabled
    Failed to set locale, defaulting to C
    Loaded plugins: fastestmirror, presto
    Loading mirror speeds from cached hostfile
     * base: ftp.heanet.ie
     * extras: ftp.heanet.ie
     * updates: ftp.heanet.ie
    base                                                                                                                                                     | 3.7 kB     00:00
    extras                                                                                                                                                   | 3.4 kB     00:00
    updates                                                                                                                                                  | 3.4 kB     00:00
    repo id                                                                        repo name                                                                                  status
    base                                                                           CentOS-6 - Base                                                                            6696
    extras                                                                         CentOS-6 - Extras                                                                            64
    updates                                                                        CentOS-6 - Updates                                                                          959
    repolist: 7719
    $ 
    ```

 1. List the /etc/passwd entries for neymar and ronaldo
    
    ```
    $ egrep "neymar|ronaldo" /etc/passwd
    neymar:x:2010:2010::/home/neymar:/bin/bash
    ronaldo:x:2016:2016::/home/ronaldo:/bin/bash
    $ 
    ```

 1. List the /etc/group entries for barca and merengues
    
    ```
    $ egrep "barca|merengues" /etc/group
    barca:x:2017:ronaldo
    merengues:x:2018:neymar
    $ 
    
    ```



