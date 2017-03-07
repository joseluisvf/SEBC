# HDFS Lab
## Replicate to another cluster

 1. Name a source directory after your GitHub handle

    ```
    $ su - hdfs
    $ hdfs dfs -mkdir /joseluisvf
    $  
    ```

 1. Name a target directory after your partner's GitHub handle

    ```
    $ hdfs dfs -mkdir /ricardo-aires
    $
    ```

 1. Use teragen to create a 500 MB file

    ```
    $ hadoop jar /opt/cloudera/parcels/CDH/lib/hadoop-0.20-mapreduce/hadoop-examples.jar teragen -Dmapred.map.tasks=50 -Dmapred.map.tasks.speculative.execution=false 5242880 /joseluisvf/teragen
    17/03/07 09:53:50 INFO client.RMProxy: Connecting to ResourceManager at ip-172-31-18-176.eu-west-1.compute.internal/172.31.18.176:8032
    17/03/07 09:53:51 INFO terasort.TeraSort: Generating 5242880 using 50
    17/03/07 09:53:51 INFO mapreduce.JobSubmitter: number of splits:50
    17/03/07 09:53:51 INFO Configuration.deprecation: mapred.map.tasks is deprecated. Instead, use mapreduce.job.maps
    17/03/07 09:53:51 INFO Configuration.deprecation: mapred.map.tasks.speculative.execution is deprecated. Instead, use mapreduce.map.speculative
    17/03/07 09:53:51 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1488812947489_0001
    17/03/07 09:53:52 INFO impl.YarnClientImpl: Submitted application application_1488812947489_0001
    17/03/07 09:53:52 INFO mapreduce.Job: The url to track the job: http://ip-172-31-18-176.eu-west-1.compute.internal:8088/proxy/application_1488812947489_0001/
    17/03/07 09:53:52 INFO mapreduce.Job: Running job: job_1488812947489_0001
    17/03/07 09:53:59 INFO mapreduce.Job: Job job_1488812947489_0001 running in uber mode : false
    17/03/07 09:53:59 INFO mapreduce.Job:  map 0% reduce 0%
    17/03/07 09:54:09 INFO mapreduce.Job:  map 2% reduce 0%
    17/03/07 09:54:10 INFO mapreduce.Job:  map 16% reduce 0%
    17/03/07 09:54:11 INFO mapreduce.Job:  map 18% reduce 0%
    17/03/07 09:54:13 INFO mapreduce.Job:  map 24% reduce 0%
    17/03/07 09:54:14 INFO mapreduce.Job:  map 26% reduce 0%
    17/03/07 09:54:18 INFO mapreduce.Job:  map 28% reduce 0%
    17/03/07 09:54:20 INFO mapreduce.Job:  map 44% reduce 0%
    17/03/07 09:54:24 INFO mapreduce.Job:  map 48% reduce 0%
    17/03/07 09:54:25 INFO mapreduce.Job:  map 50% reduce 0%
    17/03/07 09:54:26 INFO mapreduce.Job:  map 54% reduce 0%
    17/03/07 09:54:28 INFO mapreduce.Job:  map 60% reduce 0%
    17/03/07 09:54:29 INFO mapreduce.Job:  map 66% reduce 0%
    17/03/07 09:54:30 INFO mapreduce.Job:  map 70% reduce 0%
    17/03/07 09:54:34 INFO mapreduce.Job:  map 72% reduce 0%
    17/03/07 09:54:35 INFO mapreduce.Job:  map 76% reduce 0%
    17/03/07 09:54:36 INFO mapreduce.Job:  map 78% reduce 0%
    17/03/07 09:54:37 INFO mapreduce.Job:  map 84% reduce 0%
    17/03/07 09:54:38 INFO mapreduce.Job:  map 90% reduce 0%
    17/03/07 09:54:39 INFO mapreduce.Job:  map 96% reduce 0%
    17/03/07 09:54:40 INFO mapreduce.Job:  map 100% reduce 0%
    17/03/07 09:54:41 INFO mapreduce.Job: Job job_1488812947489_0001 completed successfully
    17/03/07 09:54:41 INFO mapreduce.Job: Counters: 31
	File System Counters
		FILE: Number of bytes read=0
		FILE: Number of bytes written=6134690
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=4247
		HDFS: Number of bytes written=524288000
		HDFS: Number of read operations=200
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=100
	Job Counters
		Launched map tasks=50
		Other local map tasks=50
		Total time spent by all maps in occupied slots (ms)=435724
		Total time spent by all reduces in occupied slots (ms)=0
		Total time spent by all map tasks (ms)=435724
		Total vcore-seconds taken by all map tasks=435724
		Total megabyte-seconds taken by all map tasks=446181376
	Map-Reduce Framework
		Map input records=5242880
		Map output records=5242880
		Input split bytes=4247
		Spilled Records=0
		Failed Shuffles=0
		Merged Map outputs=0
		GC time elapsed (ms)=4468
		CPU time spent (ms)=121450
		Physical memory (bytes) snapshot=9794674688
		Virtual memory (bytes) snapshot=78338043904
		Total committed heap usage (bytes)=14757134336
	org.apache.hadoop.examples.terasort.TeraGen$Counters
		CHECKSUM=11257830824958050
	File Input Format Counters
		Bytes Read=0
	File Output Format Counters
		Bytes Written=524288000
    $
    ```
 1. Copy your partner's file to your target directory(distcp)

    ```
    $ hadoop distcp hdfs://ip-172-31-16-248.eu-west-1.compute.internal:8020/ricardo-aires/teragen hdfs://ip-172-31-18-176.eu-west-1.compute.internal:8020/ricardo-aires
    17/03/07 10:19:52 INFO tools.DistCp: Input Options: DistCpOptions{atomicCommit=false, syncFolder=false, deleteMissing=false, ignoreFailures=false, overwrite=false, append=false, useDiff=false, useRdiff=false, fromSnapshot=null, toSnapshot=null, skipCRC=false, blocking=true, numListstatusThreads=0, maxMaps=20, mapBandwidth=100, sslConfigurationFile='null', copyStrategy='uniformsize', preserveStatus=[], preserveRawXattrs=false, atomicWorkPath=null, logPath=null, sourceFileListing=null, sourcePaths=[hdfs://ip-172-31-16-248.eu-west-1.compute.internal:8020/ricardo-aires/teragen], targetPath=hdfs://ip-172-31-18-176.eu-west-1.compute.internal:8020/ricardo-aires, targetPathExists=true, filtersFile='null'}
    17/03/07 10:19:52 INFO client.RMProxy: Connecting to ResourceManager at ip-172-31-18-176.eu-west-1.compute.internal/172.31.18.176:8032
    17/03/07 10:19:53 INFO tools.SimpleCopyListing: Paths (files+dirs) cnt = 52; dirCnt = 1
    17/03/07 10:19:53 INFO tools.SimpleCopyListing: Build file listing completed.
    17/03/07 10:19:53 INFO Configuration.deprecation: io.sort.mb is deprecated. Instead, use mapreduce.task.io.sort.mb
    17/03/07 10:19:53 INFO Configuration.deprecation: io.sort.factor is deprecated. Instead, use mapreduce.task.io.sort.factor
    17/03/07 10:19:53 INFO tools.DistCp: Number of paths in the copy list: 52
    17/03/07 10:19:53 INFO tools.DistCp: Number of paths in the copy list: 52
    17/03/07 10:19:53 INFO client.RMProxy: Connecting to ResourceManager at ip-172-31-18-176.eu-west-1.compute.internal/172.31.18.176:8032
    17/03/07 10:19:53 INFO mapreduce.JobSubmitter: number of splits:25
    17/03/07 10:19:53 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1488812947489_0009
    17/03/07 10:19:53 INFO impl.YarnClientImpl: Submitted application application_1488812947489_0009
    17/03/07 10:19:54 INFO mapreduce.Job: The url to track the job: http://ip-172-31-18-176.eu-west-1.compute.internal:8088/proxy/application_1488812947489_0009/
    17/03/07 10:19:54 INFO tools.DistCp: DistCp job-id: job_1488812947489_0009
    17/03/07 10:19:54 INFO mapreduce.Job: Running job: job_1488812947489_0009
    17/03/07 10:20:00 INFO mapreduce.Job: Job job_1488812947489_0009 running in uber mode : false
    17/03/07 10:20:00 INFO mapreduce.Job:  map 0% reduce 0%
    17/03/07 10:20:09 INFO mapreduce.Job:  map 28% reduce 0%
    17/03/07 10:20:10 INFO mapreduce.Job:  map 36% reduce 0%
    17/03/07 10:20:11 INFO mapreduce.Job:  map 44% reduce 0%
    17/03/07 10:20:12 INFO mapreduce.Job:  map 52% reduce 0%
    17/03/07 10:20:17 INFO mapreduce.Job:  map 80% reduce 0%
    17/03/07 10:20:18 INFO mapreduce.Job:  map 88% reduce 0%
    17/03/07 10:20:19 INFO mapreduce.Job:  map 96% reduce 0%
    17/03/07 10:20:20 INFO mapreduce.Job:  map 100% reduce 0%
    17/03/07 10:20:20 INFO mapreduce.Job: Job job_1488812947489_0009 completed successfully
    17/03/07 10:20:20 INFO mapreduce.Job: Counters: 33
	File System Counters
		FILE: Number of bytes read=0
		FILE: Number of bytes written=3143040
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=20900
		HDFS: Number of bytes written=4943
		HDFS: Number of read operations=406
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=51
	Job Counters
		Launched map tasks=25
		Other local map tasks=25
		Total time spent by all maps in occupied slots (ms)=186744
		Total time spent by all reduces in occupied slots (ms)=0
		Total time spent by all map tasks (ms)=186744
		Total vcore-seconds taken by all map tasks=186744
		Total megabyte-seconds taken by all map tasks=191225856
	Map-Reduce Framework
		Map input records=52
		Map output records=51
		Input split bytes=2900
		Spilled Records=0
		Failed Shuffles=0
		Merged Map outputs=0
		GC time elapsed (ms)=1170
		CPU time spent (ms)=26770
		Physical memory (bytes) snapshot=4637597696
		Virtual memory (bytes) snapshot=39132684288
		Total committed heap usage (bytes)=6213861376
	File Input Format Counters
		Bytes Read=18000
	File Output Format Counters
		Bytes Written=4943
	org.apache.hadoop.tools.mapred.CopyMapper$Counter
		BYTESSKIPPED=524288000
		COPY=1
		SKIP=51
    $ hdfs dfs -du -h /ricardo-aires
    500 M  1.5 G  /ricardo-aires/teragen
    $
    ```

 1. Browse the results

    ```
    $ hdfs fsck /ricardo-aires/teragen -files -blocks
    Connecting to namenode via http://ip-172-31-18-176.eu-west-1.compute.internal:50070
    FSCK started by hdfs (auth:SIMPLE) from /172.31.20.167 for path /ricardo-aires/teragen at Tue Mar 07 10:26:19 UTC 2017
    /ricardo-aires/teragen <dir>
    /ricardo-aires/teragen/_SUCCESS 0 bytes, 0 block(s):  OK

    /ricardo-aires/teragen/part-m-00000 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743998_3174 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00001 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744002_3178 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00002 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743986_3162 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00003 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743995_3171 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00004 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743978_3154 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00005 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743987_3163 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00006 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743988_3164 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00007 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743993_3169 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00008 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743997_3173 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00009 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744001_3177 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00010 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743984_3160 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00011 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743994_3170 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00012 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743979_3155 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00013 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743983_3159 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00014 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743977_3153 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00015 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743981_3157 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00016 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743996_3172 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00017 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744000_3176 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00018 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743985_3161 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00019 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743992_3168 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00020 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743982_3158 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00021 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743991_3167 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00022 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743980_3156 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00023 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743989_3165 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00024 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073743999_3175 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00025 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744003_3179 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00026 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744004_3180 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00027 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744006_3182 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00028 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744005_3181 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00029 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744008_3184 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00030 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744009_3185 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00031 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744014_3190 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00032 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744010_3186 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00033 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744013_3189 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00034 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744012_3188 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00035 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744015_3191 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00036 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744007_3183 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00037 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744011_3187 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00038 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744016_3192 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00039 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744019_3195 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00040 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744017_3193 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00041 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744022_3198 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00042 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744018_3194 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00043 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744023_3199 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00044 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744021_3197 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00045 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744025_3201 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00046 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744020_3196 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00047 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744024_3200 len=10485700 Live_repl=3

    /ricardo-aires/teragen/part-m-00048 10485800 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744027_3203 len=10485800 Live_repl=3

    /ricardo-aires/teragen/part-m-00049 10485700 bytes, 1 block(s):  OK
    0. BP-1022247301-172.31.18.176-1488812885655:blk_1073744028_3204 len=10485700 Live_repl=3

    Status: HEALTHY
    Total size:	524288000 B
    Total dirs:	1
    Total files:	51
    Total symlinks:		0
    Total blocks (validated):	50 (avg. block size 10485760 B)
    Minimally replicated blocks:	50 (100.0 %)
    Over-replicated blocks:	0 (0.0 %)
    Under-replicated blocks:	0 (0.0 %)
    Mis-replicated blocks:		0 (0.0 %)
    Default replication factor:	3
    Average block replication:	3.0
    Corrupt blocks:		0
    Missing replicas:		0 (0.0 %)
    Number of data-nodes:		4
    Number of racks:		1
    FSCK ended at Tue Mar 07 10:26:19 UTC 2017 in 6 milliseconds


    The filesystem under path '/ricardo-aires/teragen' is HEALTHY
    $
    ```
