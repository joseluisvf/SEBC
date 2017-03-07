# YARN/RM Lab

 * Food for thought:
    * What criteria affects workload factor?
    ```
    The workload factor is a fraction between available vcores and the amount of worker spindles
    ```
    * What does a value of 1, 2, or 4 signify?
    ```
    A low value represents that we will be running CPU-intensive jobs, whereas a high number represents that we will be running I/O-intensive jobs.
    A number of 1 means that we will be using one vcore per spindle; we use the disk exlusively. In contrast, a number of 4 means we will be sharing a spindle among four different vcores.
    ```