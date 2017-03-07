# HDFS Lab
## Test HDFS performance

 1. Create an end-user Linux account named with your GitHub handle

    ```
    $ useradd joseluisvf
    $ su - hdfs
    $ hdfs dfs -mkdir /user/joseluisvf
    $ hdfs dfs -chown joseluisvf /user/joseluisvf
    ```

 1. Create a 10 GB file using teragen

    ```
    $ exit
    logout
    [root@ip-172-31-20-167 ~]# su - joseluisvf
    [joseluisvf@ip-172-31-20-167 ~]$ time hadoop jar /opt/cloudera/parcels/CDH/lib/hadoop-0.20-mapreduce/hadoop-examples.jar teragen -Dmapreduce.job.maps=4 -Ddfs.blocksize=33554432 -Dmapreduce.map.speculative=false 107374182 file10G
    17/03/07 10:46:57 INFO client.RMProxy: Connecting to ResourceManager at ip-172-31-18-176.eu-west-1.compute.internal/172.31.18.176:8032
    17/03/07 10:46:57 INFO terasort.TeraSort: Generating 107374182 using 4
    17/03/07 10:46:58 INFO mapreduce.JobSubmitter: number of splits:4
    17/03/07 10:46:58 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1488812947489_0010
    17/03/07 10:46:58 INFO impl.YarnClientImpl: Submitted application application_1488812947489_0010
    17/03/07 10:46:58 INFO mapreduce.Job: The url to track the job: http://ip-172-31-18-176.eu-west-1.compute.internal:8088/proxy/application_1488812947489_0010/
    17/03/07 10:46:58 INFO mapreduce.Job: Running job: job_1488812947489_0010
    17/03/07 10:47:04 INFO mapreduce.Job: Job job_1488812947489_0010 running in uber mode : false
    17/03/07 10:47:04 INFO mapreduce.Job:  map 0% reduce 0%
    17/03/07 10:47:16 INFO mapreduce.Job:  map 6% reduce 0%
    17/03/07 10:47:17 INFO mapreduce.Job:  map 12% reduce 0%
    17/03/07 10:47:20 INFO mapreduce.Job:  map 17% reduce 0%
    17/03/07 10:47:23 INFO mapreduce.Job:  map 20% reduce 0%
    17/03/07 10:47:26 INFO mapreduce.Job:  map 22% reduce 0%
    17/03/07 10:47:29 INFO mapreduce.Job:  map 24% reduce 0%
    17/03/07 10:47:32 INFO mapreduce.Job:  map 26% reduce 0%
    17/03/07 10:47:35 INFO mapreduce.Job:  map 28% reduce 0%
    17/03/07 10:47:38 INFO mapreduce.Job:  map 30% reduce 0%
    17/03/07 10:47:41 INFO mapreduce.Job:  map 34% reduce 0%
    17/03/07 10:47:44 INFO mapreduce.Job:  map 37% reduce 0%
    17/03/07 10:47:47 INFO mapreduce.Job:  map 40% reduce 0%
    17/03/07 10:47:50 INFO mapreduce.Job:  map 42% reduce 0%
    17/03/07 10:47:53 INFO mapreduce.Job:  map 44% reduce 0%
    17/03/07 10:47:56 INFO mapreduce.Job:  map 46% reduce 0%
    17/03/07 10:47:59 INFO mapreduce.Job:  map 49% reduce 0%
    17/03/07 10:48:02 INFO mapreduce.Job:  map 51% reduce 0%
    17/03/07 10:48:05 INFO mapreduce.Job:  map 54% reduce 0%
    17/03/07 10:48:08 INFO mapreduce.Job:  map 57% reduce 0%
    17/03/07 10:48:11 INFO mapreduce.Job:  map 60% reduce 0%
    17/03/07 10:48:14 INFO mapreduce.Job:  map 62% reduce 0%
    17/03/07 10:48:17 INFO mapreduce.Job:  map 65% reduce 0%
    17/03/07 10:48:20 INFO mapreduce.Job:  map 67% reduce 0%
    17/03/07 10:48:23 INFO mapreduce.Job:  map 70% reduce 0%
    17/03/07 10:48:26 INFO mapreduce.Job:  map 73% reduce 0%
    17/03/07 10:48:29 INFO mapreduce.Job:  map 76% reduce 0%
    17/03/07 10:48:32 INFO mapreduce.Job:  map 78% reduce 0%
    17/03/07 10:48:35 INFO mapreduce.Job:  map 80% reduce 0%
    17/03/07 10:48:38 INFO mapreduce.Job:  map 82% reduce 0%
    17/03/07 10:48:41 INFO mapreduce.Job:  map 85% reduce 0%
    17/03/07 10:48:44 INFO mapreduce.Job:  map 87% reduce 0%
    17/03/07 10:48:47 INFO mapreduce.Job:  map 90% reduce 0%
    17/03/07 10:48:50 INFO mapreduce.Job:  map 94% reduce 0%
    17/03/07 10:48:53 INFO mapreduce.Job:  map 96% reduce 0%
    17/03/07 10:48:56 INFO mapreduce.Job:  map 98% reduce 0%
    17/03/07 10:48:58 INFO mapreduce.Job:  map 99% reduce 0%
    17/03/07 10:48:59 INFO mapreduce.Job:  map 100% reduce 0%
    17/03/07 10:49:00 INFO mapreduce.Job: Job job_1488812947489_0010 completed successfully
    17/03/07 10:49:00 INFO mapreduce.Job: Counters: 31
    	File System Counters
    		FILE: Number of bytes read=0
    		FILE: Number of bytes written=490952
    		FILE: Number of read operations=0
    		FILE: Number of large read operations=0
    		FILE: Number of write operations=0
    		HDFS: Number of bytes read=344
    		HDFS: Number of bytes written=10737418200
    		HDFS: Number of read operations=16
    		HDFS: Number of large read operations=0
    		HDFS: Number of write operations=8
    	Job Counters
    		Launched map tasks=4
    		Other local map tasks=4
    		Total time spent by all maps in occupied slots (ms)=445716
    		Total time spent by all reduces in occupied slots (ms)=0
    		Total time spent by all map tasks (ms)=445716
    		Total vcore-seconds taken by all map tasks=445716
    		Total megabyte-seconds taken by all map tasks=456413184
    	Map-Reduce Framework
    		Map input records=107374182
    		Map output records=107374182
    		Input split bytes=344
    		Spilled Records=0
    		Failed Shuffles=0
    		Merged Map outputs=0
    		GC time elapsed (ms)=1753
    		CPU time spent (ms)=160570
    		Physical memory (bytes) snapshot=920608768
    		Virtual memory (bytes) snapshot=6264557568
    		Total committed heap usage (bytes)=898105344
    	org.apache.hadoop.examples.terasort.TeraGen$Counters
    		CHECKSUM=230593859918397906
    	File Input Format Counters
    		Bytes Read=0
    	File Output Format Counters
    		Bytes Written=10737418200
    
    real	2m6.128s
    user	0m5.830s
    sys	0m0.722s
    $
    ```
 1. Run the terasort command on this file

    ```
    $ time hadoop jar /opt/cloudera/parcels/CDH/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar terasort file10G terasortoutput
    17/03/07 10:54:37 INFO terasort.TeraSort: starting
    17/03/07 10:54:39 INFO input.FileInputFormat: Total input paths to process : 4
    Spent 269ms computing base-splits.
    Spent 6ms computing TeraScheduler splits.
    Computing input splits took 276ms
    Sampling 10 splits of 320
    Making 8 from 100000 sampled records
    Computing parititions took 774ms
    Spent 1053ms computing partitions.
    17/03/07 10:54:39 INFO client.RMProxy: Connecting to ResourceManager at ip-172-31-18-176.eu-west-1.compute.internal/172.31.18.176:8032
    17/03/07 10:54:40 INFO mapreduce.JobSubmitter: number of splits:320
    17/03/07 10:54:40 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1488812947489_0011
    17/03/07 10:54:40 INFO impl.YarnClientImpl: Submitted application application_1488812947489_0011
    17/03/07 10:54:40 INFO mapreduce.Job: The url to track the job: http://ip-172-31-18-176.eu-west-1.compute.internal:8088/proxy/application_1488812947489_0011/
    17/03/07 10:54:40 INFO mapreduce.Job: Running job: job_1488812947489_0011
    17/03/07 10:54:47 INFO mapreduce.Job: Job job_1488812947489_0011 running in uber mode : false
    17/03/07 10:54:47 INFO mapreduce.Job:  map 0% reduce 0%
    17/03/07 10:54:58 INFO mapreduce.Job:  map 1% reduce 0%
    17/03/07 10:54:59 INFO mapreduce.Job:  map 3% reduce 0%
    17/03/07 10:55:01 INFO mapreduce.Job:  map 4% reduce 0%
    17/03/07 10:55:08 INFO mapreduce.Job:  map 5% reduce 0%
    17/03/07 10:55:09 INFO mapreduce.Job:  map 6% reduce 0%
    17/03/07 10:55:10 INFO mapreduce.Job:  map 7% reduce 0%
    17/03/07 10:55:14 INFO mapreduce.Job:  map 8% reduce 0%
    17/03/07 10:55:18 INFO mapreduce.Job:  map 9% reduce 0%
    17/03/07 10:55:19 INFO mapreduce.Job:  map 10% reduce 0%
    17/03/07 10:55:21 INFO mapreduce.Job:  map 11% reduce 0%
    17/03/07 10:55:27 INFO mapreduce.Job:  map 13% reduce 0%
    17/03/07 10:55:29 INFO mapreduce.Job:  map 14% reduce 0%
    17/03/07 10:55:31 INFO mapreduce.Job:  map 15% reduce 0%
    17/03/07 10:55:37 INFO mapreduce.Job:  map 16% reduce 0%
    17/03/07 10:55:39 INFO mapreduce.Job:  map 17% reduce 0%
    17/03/07 10:55:40 INFO mapreduce.Job:  map 18% reduce 0%
    17/03/07 10:55:42 INFO mapreduce.Job:  map 19% reduce 0%
    17/03/07 10:55:47 INFO mapreduce.Job:  map 20% reduce 0%
    17/03/07 10:55:48 INFO mapreduce.Job:  map 21% reduce 0%
    17/03/07 10:55:52 INFO mapreduce.Job:  map 22% reduce 0%
    17/03/07 10:55:53 INFO mapreduce.Job:  map 23% reduce 0%
    17/03/07 10:55:57 INFO mapreduce.Job:  map 24% reduce 0%
    17/03/07 10:55:59 INFO mapreduce.Job:  map 25% reduce 0%
    17/03/07 10:56:02 INFO mapreduce.Job:  map 26% reduce 0%
    17/03/07 10:56:06 INFO mapreduce.Job:  map 28% reduce 0%
    17/03/07 10:56:09 INFO mapreduce.Job:  map 29% reduce 0%
    17/03/07 10:56:12 INFO mapreduce.Job:  map 30% reduce 0%
    17/03/07 10:56:15 INFO mapreduce.Job:  map 31% reduce 0%
    17/03/07 10:56:18 INFO mapreduce.Job:  map 32% reduce 0%
    17/03/07 10:56:19 INFO mapreduce.Job:  map 33% reduce 0%
    17/03/07 10:56:22 INFO mapreduce.Job:  map 34% reduce 0%
    17/03/07 10:56:25 INFO mapreduce.Job:  map 35% reduce 0%
    17/03/07 10:56:28 INFO mapreduce.Job:  map 36% reduce 0%
    17/03/07 10:56:31 INFO mapreduce.Job:  map 37% reduce 0%
    17/03/07 10:56:32 INFO mapreduce.Job:  map 38% reduce 0%
    17/03/07 10:56:35 INFO mapreduce.Job:  map 39% reduce 0%
    17/03/07 10:56:38 INFO mapreduce.Job:  map 40% reduce 0%
    17/03/07 10:56:41 INFO mapreduce.Job:  map 41% reduce 0%
    17/03/07 10:56:44 INFO mapreduce.Job:  map 42% reduce 0%
    17/03/07 10:56:45 INFO mapreduce.Job:  map 43% reduce 0%
    17/03/07 10:56:47 INFO mapreduce.Job:  map 44% reduce 0%
    17/03/07 10:56:50 INFO mapreduce.Job:  map 45% reduce 0%
    17/03/07 10:56:53 INFO mapreduce.Job:  map 46% reduce 0%
    17/03/07 10:56:57 INFO mapreduce.Job:  map 47% reduce 0%
    17/03/07 10:56:58 INFO mapreduce.Job:  map 48% reduce 0%
    17/03/07 10:57:01 INFO mapreduce.Job:  map 49% reduce 0%
    17/03/07 10:57:04 INFO mapreduce.Job:  map 50% reduce 0%
    17/03/07 10:57:08 INFO mapreduce.Job:  map 51% reduce 0%
    17/03/07 10:57:11 INFO mapreduce.Job:  map 52% reduce 0%
    17/03/07 10:57:12 INFO mapreduce.Job:  map 53% reduce 0%
    17/03/07 10:57:14 INFO mapreduce.Job:  map 54% reduce 0%
    17/03/07 10:57:18 INFO mapreduce.Job:  map 55% reduce 0%
    17/03/07 10:57:21 INFO mapreduce.Job:  map 56% reduce 0%
    17/03/07 10:57:24 INFO mapreduce.Job:  map 57% reduce 0%
    17/03/07 10:57:25 INFO mapreduce.Job:  map 58% reduce 0%
    17/03/07 10:57:27 INFO mapreduce.Job:  map 59% reduce 0%
    17/03/07 10:57:31 INFO mapreduce.Job:  map 60% reduce 0%
    17/03/07 10:57:34 INFO mapreduce.Job:  map 61% reduce 0%
    17/03/07 10:57:37 INFO mapreduce.Job:  map 62% reduce 0%
    17/03/07 10:57:38 INFO mapreduce.Job:  map 63% reduce 0%
    17/03/07 10:57:41 INFO mapreduce.Job:  map 64% reduce 0%
    17/03/07 10:57:43 INFO mapreduce.Job:  map 65% reduce 0%
    17/03/07 10:57:47 INFO mapreduce.Job:  map 66% reduce 0%
    17/03/07 10:57:50 INFO mapreduce.Job:  map 67% reduce 0%
    17/03/07 10:57:51 INFO mapreduce.Job:  map 68% reduce 0%
    17/03/07 10:57:54 INFO mapreduce.Job:  map 69% reduce 0%
    17/03/07 10:57:57 INFO mapreduce.Job:  map 70% reduce 0%
    17/03/07 10:57:59 INFO mapreduce.Job:  map 71% reduce 0%
    17/03/07 10:58:03 INFO mapreduce.Job:  map 72% reduce 0%
    17/03/07 10:58:04 INFO mapreduce.Job:  map 73% reduce 0%
    17/03/07 10:58:07 INFO mapreduce.Job:  map 74% reduce 0%
    17/03/07 10:58:09 INFO mapreduce.Job:  map 75% reduce 0%
    17/03/07 10:58:12 INFO mapreduce.Job:  map 76% reduce 0%
    17/03/07 10:58:16 INFO mapreduce.Job:  map 77% reduce 0%
    17/03/07 10:58:17 INFO mapreduce.Job:  map 78% reduce 0%
    17/03/07 10:58:19 INFO mapreduce.Job:  map 79% reduce 0%
    17/03/07 10:58:21 INFO mapreduce.Job:  map 80% reduce 0%
    17/03/07 10:58:26 INFO mapreduce.Job:  map 81% reduce 0%
    17/03/07 10:58:28 INFO mapreduce.Job:  map 82% reduce 0%
    17/03/07 10:58:30 INFO mapreduce.Job:  map 83% reduce 0%
    17/03/07 10:58:31 INFO mapreduce.Job:  map 84% reduce 0%
    17/03/07 10:58:37 INFO mapreduce.Job:  map 84% reduce 2%
    17/03/07 10:58:40 INFO mapreduce.Job:  map 84% reduce 6%
    17/03/07 10:58:41 INFO mapreduce.Job:  map 84% reduce 9%
    17/03/07 10:58:43 INFO mapreduce.Job:  map 85% reduce 11%
    17/03/07 10:58:44 INFO mapreduce.Job:  map 85% reduce 17%
    17/03/07 10:58:45 INFO mapreduce.Job:  map 86% reduce 17%
    17/03/07 10:58:47 INFO mapreduce.Job:  map 86% reduce 18%
    17/03/07 10:58:49 INFO mapreduce.Job:  map 86% reduce 19%
    17/03/07 10:58:50 INFO mapreduce.Job:  map 86% reduce 22%
    17/03/07 10:58:51 INFO mapreduce.Job:  map 87% reduce 23%
    17/03/07 10:58:55 INFO mapreduce.Job:  map 88% reduce 23%
    17/03/07 10:58:56 INFO mapreduce.Job:  map 88% reduce 25%
    17/03/07 10:58:57 INFO mapreduce.Job:  map 88% reduce 26%
    17/03/07 10:58:59 INFO mapreduce.Job:  map 89% reduce 26%
    17/03/07 10:59:03 INFO mapreduce.Job:  map 90% reduce 26%
    17/03/07 10:59:06 INFO mapreduce.Job:  map 91% reduce 26%
    17/03/07 10:59:11 INFO mapreduce.Job:  map 92% reduce 27%
    17/03/07 10:59:15 INFO mapreduce.Job:  map 93% reduce 27%
    17/03/07 10:59:19 INFO mapreduce.Job:  map 94% reduce 27%
    17/03/07 10:59:22 INFO mapreduce.Job:  map 95% reduce 27%
    17/03/07 10:59:23 INFO mapreduce.Job:  map 95% reduce 28%
    17/03/07 10:59:28 INFO mapreduce.Job:  map 96% reduce 28%
    17/03/07 10:59:29 INFO mapreduce.Job:  map 97% reduce 28%
    17/03/07 10:59:35 INFO mapreduce.Job:  map 98% reduce 28%
    17/03/07 10:59:37 INFO mapreduce.Job:  map 98% reduce 29%
    17/03/07 10:59:38 INFO mapreduce.Job:  map 99% reduce 29%
    17/03/07 10:59:42 INFO mapreduce.Job:  map 100% reduce 29%
    17/03/07 10:59:45 INFO mapreduce.Job:  map 100% reduce 31%
    17/03/07 10:59:47 INFO mapreduce.Job:  map 100% reduce 36%
    17/03/07 10:59:48 INFO mapreduce.Job:  map 100% reduce 41%
    17/03/07 10:59:49 INFO mapreduce.Job:  map 100% reduce 53%
    17/03/07 10:59:50 INFO mapreduce.Job:  map 100% reduce 57%
    17/03/07 10:59:51 INFO mapreduce.Job:  map 100% reduce 60%
    17/03/07 10:59:52 INFO mapreduce.Job:  map 100% reduce 63%
    17/03/07 10:59:53 INFO mapreduce.Job:  map 100% reduce 64%
    17/03/07 10:59:54 INFO mapreduce.Job:  map 100% reduce 65%
    17/03/07 10:59:55 INFO mapreduce.Job:  map 100% reduce 68%
    17/03/07 10:59:57 INFO mapreduce.Job:  map 100% reduce 70%
    17/03/07 10:59:58 INFO mapreduce.Job:  map 100% reduce 72%
    17/03/07 10:59:59 INFO mapreduce.Job:  map 100% reduce 73%
    17/03/07 11:00:00 INFO mapreduce.Job:  map 100% reduce 75%
    17/03/07 11:00:01 INFO mapreduce.Job:  map 100% reduce 79%
    17/03/07 11:00:03 INFO mapreduce.Job:  map 100% reduce 81%
    17/03/07 11:00:04 INFO mapreduce.Job:  map 100% reduce 83%
    17/03/07 11:00:05 INFO mapreduce.Job:  map 100% reduce 86%
    17/03/07 11:00:06 INFO mapreduce.Job:  map 100% reduce 88%
    17/03/07 11:00:07 INFO mapreduce.Job:  map 100% reduce 89%
    17/03/07 11:00:08 INFO mapreduce.Job:  map 100% reduce 90%
    17/03/07 11:00:09 INFO mapreduce.Job:  map 100% reduce 92%
    17/03/07 11:00:10 INFO mapreduce.Job:  map 100% reduce 94%
    17/03/07 11:00:13 INFO mapreduce.Job:  map 100% reduce 95%
    17/03/07 11:00:14 INFO mapreduce.Job:  map 100% reduce 96%
    17/03/07 11:00:17 INFO mapreduce.Job:  map 100% reduce 97%
    17/03/07 11:00:20 INFO mapreduce.Job:  map 100% reduce 98%
    17/03/07 11:00:23 INFO mapreduce.Job:  map 100% reduce 99%
    17/03/07 11:00:26 INFO mapreduce.Job:  map 100% reduce 100%
    17/03/07 11:00:27 INFO mapreduce.Job: Job job_1488812947489_0011 completed successfully
    17/03/07 11:00:27 INFO mapreduce.Job: Counters: 49
    	File System Counters
    		FILE: Number of bytes read=4805341655
    		FILE: Number of bytes written=9543692450
    		FILE: Number of read operations=0
    		FILE: Number of large read operations=0
    		FILE: Number of write operations=0
    		HDFS: Number of bytes read=10737468440
    		HDFS: Number of bytes written=10737418200
    		HDFS: Number of read operations=984
    		HDFS: Number of large read operations=0
    		HDFS: Number of write operations=16
    	Job Counters
    		Launched map tasks=320
    		Launched reduce tasks=8
    		Data-local map tasks=320
    		Total time spent by all maps in occupied slots (ms)=2960777
    		Total time spent by all reduces in occupied slots (ms)=759213
    		Total time spent by all map tasks (ms)=2960777
    		Total time spent by all reduce tasks (ms)=759213
    		Total vcore-seconds taken by all map tasks=2960777
    		Total vcore-seconds taken by all reduce tasks=759213
    		Total megabyte-seconds taken by all map tasks=3031835648
    		Total megabyte-seconds taken by all reduce tasks=777434112
    	Map-Reduce Framework
    		Map input records=107374182
    		Map output records=107374182
    		Map output bytes=10952166564
    		Map output materialized bytes=4697597105
    		Input split bytes=50240
    		Combine input records=0
    		Combine output records=0
    		Reduce input groups=107374182
    		Reduce shuffle bytes=4697597105
    		Reduce input records=107374182
    		Reduce output records=107374182
    		Spilled Records=214748364
    		Shuffled Maps =2560
    		Failed Shuffles=0
    		Merged Map outputs=2560
    		GC time elapsed (ms)=41587
    		CPU time spent (ms)=1594080
    		Physical memory (bytes) snapshot=154446692352
    		Virtual memory (bytes) snapshot=513070497792
    		Total committed heap usage (bytes)=185889456128
    	Shuffle Errors
    		BAD_ID=0
    		CONNECTION=0
    		IO_ERROR=0
    		WRONG_LENGTH=0
    		WRONG_MAP=0
    		WRONG_REDUCE=0
    	File Input Format Counters
    		Bytes Read=10737418200
    	File Output Format Counters
    		Bytes Written=10737418200
    17/03/07 11:00:27 INFO terasort.TeraSort: done
    
    real	5m51.082s
    user	0m9.031s
    sys	0m0.961s
    $
    ```
        
         
