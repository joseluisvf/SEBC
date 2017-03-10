# Challenge 4 - TEST HDFS


 1. The full teragen command and job output

    ```
    $ time hadoop jar /opt/cloudera/parcels/CDH/lib/hadoop-0.20-mapreduce/hadoop-examples.jar teragen \
> -Dmapreduce.job.maps=8 \
> -Ddfs.blocksize=16777216 \
> -Dmapreduce.map.speculative=false \
> 65536000 tgen640
17/03/10 10:48:06 INFO client.RMProxy: Connecting to ResourceManager at ip-172-31-17-90.eu-west-1.compute.internal/172.31.17.90:8032
17/03/10 10:48:07 INFO terasort.TeraSort: Generating 65536000 using 8
17/03/10 10:48:07 INFO mapreduce.JobSubmitter: number of splits:8
17/03/10 10:48:07 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1489142148013_0001
17/03/10 10:48:08 INFO impl.YarnClientImpl: Submitted application application_1489142148013_0001
17/03/10 10:48:08 INFO mapreduce.Job: The url to track the job: http://ip-172-31-17-90.eu-west-1.compute.internal:8088/proxy/application_1489142148013_0001/
17/03/10 10:48:08 INFO mapreduce.Job: Running job: job_1489142148013_0001
17/03/10 10:48:16 INFO mapreduce.Job: Job job_1489142148013_0001 running in uber mode : false
17/03/10 10:48:16 INFO mapreduce.Job:  map 0% reduce 0%
17/03/10 10:48:29 INFO mapreduce.Job:  map 5% reduce 0%
17/03/10 10:48:30 INFO mapreduce.Job:  map 20% reduce 0%
17/03/10 10:48:32 INFO mapreduce.Job:  map 22% reduce 0%
17/03/10 10:48:34 INFO mapreduce.Job:  map 27% reduce 0%
17/03/10 10:48:36 INFO mapreduce.Job:  map 28% reduce 0%
17/03/10 10:48:37 INFO mapreduce.Job:  map 33% reduce 0%
17/03/10 10:48:39 INFO mapreduce.Job:  map 34% reduce 0%
17/03/10 10:48:40 INFO mapreduce.Job:  map 37% reduce 0%
17/03/10 10:48:42 INFO mapreduce.Job:  map 38% reduce 0%
17/03/10 10:48:43 INFO mapreduce.Job:  map 42% reduce 0%
17/03/10 10:48:45 INFO mapreduce.Job:  map 43% reduce 0%
17/03/10 10:48:46 INFO mapreduce.Job:  map 45% reduce 0%
17/03/10 10:48:48 INFO mapreduce.Job:  map 48% reduce 0%
17/03/10 10:48:49 INFO mapreduce.Job:  map 50% reduce 0%
17/03/10 10:48:51 INFO mapreduce.Job:  map 52% reduce 0%
17/03/10 10:48:52 INFO mapreduce.Job:  map 54% reduce 0%
17/03/10 10:48:54 INFO mapreduce.Job:  map 59% reduce 0%
17/03/10 10:48:57 INFO mapreduce.Job:  map 63% reduce 0%
17/03/10 10:48:59 INFO mapreduce.Job:  map 64% reduce 0%
17/03/10 10:49:00 INFO mapreduce.Job:  map 68% reduce 0%
17/03/10 10:49:03 INFO mapreduce.Job:  map 72% reduce 0%
17/03/10 10:49:05 INFO mapreduce.Job:  map 73% reduce 0%
17/03/10 10:49:06 INFO mapreduce.Job:  map 77% reduce 0%
17/03/10 10:49:10 INFO mapreduce.Job:  map 81% reduce 0%
17/03/10 10:49:12 INFO mapreduce.Job:  map 82% reduce 0%
17/03/10 10:49:13 INFO mapreduce.Job:  map 86% reduce 0%
17/03/10 10:49:15 INFO mapreduce.Job:  map 87% reduce 0%
17/03/10 10:49:16 INFO mapreduce.Job:  map 90% reduce 0%
17/03/10 10:49:18 INFO mapreduce.Job:  map 92% reduce 0%
17/03/10 10:49:19 INFO mapreduce.Job:  map 95% reduce 0%
17/03/10 10:49:21 INFO mapreduce.Job:  map 96% reduce 0%
17/03/10 10:49:22 INFO mapreduce.Job:  map 98% reduce 0%
17/03/10 10:49:23 INFO mapreduce.Job:  map 99% reduce 0%
17/03/10 10:49:24 INFO mapreduce.Job:  map 100% reduce 0%
17/03/10 10:49:24 INFO mapreduce.Job: Job job_1489142148013_0001 completed successfully
17/03/10 10:49:24 INFO mapreduce.Job: Counters: 31
	File System Counters
		FILE: Number of bytes read=0
		FILE: Number of bytes written=983328
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=682
		HDFS: Number of bytes written=6553600000
		HDFS: Number of read operations=32
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=16
	Job Counters
		Launched map tasks=8
		Other local map tasks=8
		Total time spent by all maps in occupied slots (ms)=501259
		Total time spent by all reduces in occupied slots (ms)=0
		Total time spent by all map tasks (ms)=501259
		Total vcore-seconds taken by all map tasks=501259
		Total megabyte-seconds taken by all map tasks=513289216
	Map-Reduce Framework
		Map input records=65536000
		Map output records=65536000
		Input split bytes=682
		Spilled Records=0
		Failed Shuffles=0
		Merged Map outputs=0
		GC time elapsed (ms)=1518
		CPU time spent (ms)=133470
		Physical memory (bytes) snapshot=2715885568
		Virtual memory (bytes) snapshot=12486885376
		Total committed heap usage (bytes)=2834300928
	org.apache.hadoop.examples.terasort.TeraGen$Counters
		CHECKSUM=140750829423462787
	File Input Format Counters
		Bytes Read=0
	File Output Format Counters
		Bytes Written=6553600000

real	1m20.356s
user	0m5.791s
sys	0m0.700s
    ```


 1. The result of the time command

    ```
    Up there (sry for the formatting - no time!)
    ```

 1. The command and output of hdfs dfs -ls /user/neymar/tgen640

    ```code
    $ hdfs dfs -ls /user/neymar/tgen640
Found 9 items
-rw-r--r--   3 neymar hadoop          0 2017-03-10 10:49 /user/neymar/tgen640/_SUCCESS
-rw-r--r--   3 neymar hadoop  819200000 2017-03-10 10:49 /user/neymar/tgen640/part-m-00000
-rw-r--r--   3 neymar hadoop  819200000 2017-03-10 10:49 /user/neymar/tgen640/part-m-00001
-rw-r--r--   3 neymar hadoop  819200000 2017-03-10 10:49 /user/neymar/tgen640/part-m-00002
-rw-r--r--   3 neymar hadoop  819200000 2017-03-10 10:49 /user/neymar/tgen640/part-m-00003
-rw-r--r--   3 neymar hadoop  819200000 2017-03-10 10:49 /user/neymar/tgen640/part-m-00004
-rw-r--r--   3 neymar hadoop  819200000 2017-03-10 10:49 /user/neymar/tgen640/part-m-00005
-rw-r--r--   3 neymar hadoop  819200000 2017-03-10 10:49 /user/neymar/tgen640/part-m-00006
-rw-r--r--   3 neymar hadoop  819200000 2017-03-10 10:49 /user/neymar/tgen640/part-m-00007
    ```

 1. The command and output to show how many blocks are stored under this directory

    ```
    $ hdfs fsck /user/neymar/tgen640 -blocks
Connecting to namenode via http://ip-172-31-17-90.eu-west-1.compute.internal:50070
FSCK started by root (auth:SIMPLE) from /172.31.24.221 for path /user/neymar/tgen640 at Fri Mar 10 10:51:55 UTC 2017
.........Status: HEALTHY
 Total size:	6553600000 B
 Total dirs:	1
 Total files:	9
 Total symlinks:		0
 Total blocks (validated):	392 (avg. block size 16718367 B)
 Minimally replicated blocks:	392 (100.0 %)
 Over-replicated blocks:	0 (0.0 %)
 Under-replicated blocks:	0 (0.0 %)
 Mis-replicated blocks:		0 (0.0 %)
 Default replication factor:	3
 Average block replication:	3.0
 Corrupt blocks:		0
 Missing replicas:		0 (0.0 %)
 Number of data-nodes:		4
 Number of racks:		1
FSCK ended at Fri Mar 10 10:51:55 UTC 2017 in 22 milliseconds


The filesystem under path '/user/neymar/tgen640' is HEALTHY
    ```
 
