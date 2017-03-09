# Resources Labs
## Tuning for YARN

 * Fastest Job

    ```
    map containers= 8
    map JVM heap= 409
    map task memory= 512
    reduce containers= 4
    reduce JVM heap= 409
    reduce task memory= 512
    
    teragen
    real    2m1.796s
    user    0m5.770s
    sys     0m0.722s
    
    terasort
    real    3m6.211s
    user    0m8.060s
    sys     0m0.852s
    ```

 * Slowest Job

    ```
    map containers= 8
    map JVM heap= 3276
    map task memory= 4096
    reduce containers= 8
    reduce JVM heap= 3276
    reduce task memory= 4096

    teragen
    real    3m33.409s
    user    0m6.288s
    sys     0m0.794s

    terasort
    real    18m11.072s
    user    0m10.470s
    sys     0m1.215s
    ``` 
