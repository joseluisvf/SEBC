# CM Install Lab
## System Configuration Checks

 1. Check vm.swappiness on all your nodes

    ```
    $ sysctl vm.swappiness
    vm.swappiness = 1
    $ grep swappiness /etc/sysctl.conf
    vm.swappiness = 1
    $ 
    ```

 1. Show the mount attributes of all volumes

    ```
    $ mount -l
    /dev/xvde on / type ext4 (rw) [centos_root]
    proc on /proc type proc (rw)
    sysfs on /sys type sysfs (rw)
    devpts on /dev/pts type devpts (rw,gid=5,mode=620)
    tmpfs on /dev/shm type tmpfs (rw)
    none on /proc/sys/fs/binfmt_misc type binfmt_misc (rw)
    $
    ```

 1. Show the reserve space of any non-root, ext-based volumes

    ```
    $ df -h
    Filesystem      Size  Used Avail Use% Mounted on
    /dev/xvde        79G  1.1G   74G   2% /
    tmpfs           7.4G     0  7.4G   0% /dev/shm
    $
    ```
 1. Disable transparent hugepages

    ```
    $ sysctl vm.nr_hugepages
    vm.nr_hugepages = 0
    $ grep kernel /boot/grub/grub.conf
    kernel /boot/vmlinuz-2.6.32-642.15.1.el6.x86_64 root=LABEL=centos_root ro crashkernel=auto LANG=en_US.UTF-8 KEYTABLE=us transparent_hugepage=never
    kernel /boot/vmlinuz-2.6.32-431.el6.x86_64 root=LABEL=centos_root ro transparent_hugepage=never
    ```

 1. List your network interface configuration

     ```
    $ ifconfig
    eth0      Link encap:Ethernet  HWaddr 06:21:B3:BD:03:B3
          inet addr:172.31.20.167  Bcast:172.31.31.255  Mask:255.255.240.0
          inet6 addr: fe80::421:b3ff:febd:3b3/64 Scope:Link
          UP BROADCAST RUNNING MULTICAST  MTU:9001  Metric:1
          RX packets:175 errors:0 dropped:0 overruns:0 frame:0
          TX packets:131 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1000
          RX bytes:17034 (16.6 KiB)  TX bytes:16212 (15.8 KiB)
          Interrupt:24

    lo        Link encap:Local Loopback
          inet addr:127.0.0.1  Mask:255.0.0.0
          inet6 addr: ::1/128 Scope:Host
          UP LOOPBACK RUNNING  MTU:65536  Metric:1
          RX packets:0 errors:0 dropped:0 overruns:0 frame:0
          TX packets:0 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:0
          RX bytes:0 (0.0 b)  TX bytes:0 (0.0 b)
     $
     ```

 1. List forward and reverse host lookups using getent or nslookup

    ```
    $ ping -c 5 zebc2
    PING zebc2 (172.31.22.18) 56(84) bytes of data.
    64 bytes from zebc2 (172.31.22.18): icmp_seq=1 ttl=64 time=3.35 ms
    64 bytes from zebc2 (172.31.22.18): icmp_seq=2 ttl=64 time=0.306 ms
    64 bytes from zebc2 (172.31.22.18): icmp_seq=3 ttl=64 time=0.362 ms
    64 bytes from zebc2 (172.31.22.18): icmp_seq=4 ttl=64 time=0.347 ms
    64 bytes from zebc2 (172.31.22.18): icmp_seq=5 ttl=64 time=0.363 ms

    --- zebc2 ping statistics ---
    5 packets transmitted, 5 received, 0% packet loss, time 4002ms
    rtt min/avg/max/mdev = 0.306/0.947/3.358/1.205 ms
    $ nslookup 172.31.22.18
    Server:		172.31.0.2
    Address:	172.31.0.2#53

    Non-authoritative answer:
    18.22.31.172.in-addr.arpa	name = ip-172-31-22-18.eu-west-1.compute.internal.

    Authoritative answers can be found from:
    
    $
    ```

 1. Show the nscd service is running

    ```
    $ service nscd status
    nscd (pid 926) is running...
    $ 
    ```

 1. Show the ntpd service is running

    ```
    $ service ntpd status
    ntpd (pid  964) is running...
    $ 
    ```