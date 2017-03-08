# CM lab
# Using the API

Pretty json

```code
$ curl -u 'joseluisvf:cloudera' http://34.251.235.171:7180/api/v2/cm/deployment |  python -m json.tool
$ % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100 27716    0 27716    0     0   137k      0 --:--:-- --:--:-- --:--:--  136k
$ {
    "clusters": [
        {
            "name": "joseluisvf",
            "services": [
                {
                    "config": {
                        "items": [
                            {
                                "name": "hive_metastore_database_host",
                                "value": "ip-172-31-20-167.eu-west-1.compute.internal"
                            },
                            {
                                "name": "hive_metastore_database_password",
                                "value": "password"
                            },
                            {
                                "name": "mapreduce_yarn_service",
                                "value": "yarn"
                            },
                            {
                                "name": "zookeeper_service",
                                "value": "zookeeper"
                            }
                        ],
                        "roleTypeConfigs": [
                            {
                                "items": [
                                    {
                                        "name": "hive_metastore_java_heapsize",
                                        "value": "606076928"
                                    }
                                ],
                                "roleType": "HIVEMETASTORE"
                            },
                            {
                                "items": [
                                    {
                                        "name": "hiveserver2_java_heapsize",
                                        "value": "606076928"
                                    },
                                    {
                                        "name": "hiveserver2_spark_driver_memory",
                                        "value": "966367641"
                                    },
                                    {
                                        "name": "hiveserver2_spark_executor_cores",
                                        "value": "4"
                                    },
                                    {
                                        "name": "hiveserver2_spark_executor_memory",
                                        "value": "3525050368"
                                    },
                                    {
                                        "name": "hiveserver2_spark_yarn_driver_memory_overhead",
                                        "value": "102"
                                    },
                                    {
                                        "name": "hiveserver2_spark_yarn_executor_memory_overhead",
                                        "value": "593"
                                    }
                                ],
                                "roleType": "HIVESERVER2"
                            }
                        ]
                    },
                    "displayName": "Hive",
                    "name": "hive",
                    "roles": [
                        {
                            "config": {
                                "items": []
                            },
                            "hostRef": {
                                "hostId": "9c98b3cb-44f6-4ebe-a8fc-f5eed1064b79"
                            },
                            "name": "hive-GATEWAY-46cc11d7ffb089c0fd9ceee1e7cd7aee",
                            "type": "GATEWAY"
                        },
                        {
                            "config": {
                                "items": []
                            },
                            "hostRef": {
                                "hostId": "869bef5f-2bb0-4d0f-a6d7-4d0603bb7d05"
                            },
                            "name": "hive-GATEWAY-7dc40c2da35f7ee4a9eaeded6a930e68",
                            "type": "GATEWAY"
                        },
                        {
                            "config": {
                                "items": []
                            },
                            "hostRef": {
                                "hostId": "eed33878-d199-414a-bd88-5a4f1c22f5de"
                            },
                            "name": "hive-GATEWAY-927e3aed987ad36059519fb5335314f9",
                            "type": "GATEWAY"
                        },
                        {
                            "config": {
                                "items": []
                            },
                            "hostRef": {
                                "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                            },
                            "name": "hive-GATEWAY-d1df3eaf79374cb8266dbfd9471fc8b3",
                            "type": "GATEWAY"
                        },
                        {
                            "config": {
                                "items": []
                            },
                            "hostRef": {
                                "hostId": "0657ea58-bf84-4c00-ad33-b889be37a5bc"
                            },
                            "name": "hive-GATEWAY-e72052cbc4e0802c59a4b7cb8cd2020b",
                            "type": "GATEWAY"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "3q9wj1hfjx5xrw3hext5z161m"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                            },
                            "name": "hive-HIVEMETASTORE-d1df3eaf79374cb8266dbfd9471fc8b3",
                            "type": "HIVEMETASTORE"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "26kqnjonirwxjdb9mp5isgk0q"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                            },
                            "name": "hive-HIVESERVER2-d1df3eaf79374cb8266dbfd9471fc8b3",
                            "type": "HIVESERVER2"
                        }
                    ],
                    "type": "HIVE"
                },
                {
                    "config": {
                        "items": [],
                        "roleTypeConfigs": [
                            {
                                "items": [
                                    {
                                        "name": "zookeeper_server_java_heapsize",
                                        "value": "606076928"
                                    }
                                ],
                                "roleType": "SERVER"
                            }
                        ]
                    },
                    "displayName": "ZooKeeper",
                    "name": "zookeeper",
                    "roles": [
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "6hklnqkbdjqsu0d9j8pxhl7yt"
                                    },
                                    {
                                        "name": "serverId",
                                        "value": "2"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "9c98b3cb-44f6-4ebe-a8fc-f5eed1064b79"
                            },
                            "name": "zookeeper-SERVER-46cc11d7ffb089c0fd9ceee1e7cd7aee",
                            "type": "SERVER"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "6l7e7f4kdd5ijog5b3o7p4w3v"
                                    },
                                    {
                                        "name": "serverId",
                                        "value": "1"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "869bef5f-2bb0-4d0f-a6d7-4d0603bb7d05"
                            },
                            "name": "zookeeper-SERVER-7dc40c2da35f7ee4a9eaeded6a930e68",
                            "type": "SERVER"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "38fbvj0h3jw7hq9ox9idn08zf"
                                    },
                                    {
                                        "name": "serverId",
                                        "value": "3"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                            },
                            "name": "zookeeper-SERVER-d1df3eaf79374cb8266dbfd9471fc8b3",
                            "type": "SERVER"
                        }
                    ],
                    "type": "ZOOKEEPER"
                },
                {
                    "config": {
                        "items": [
                            {
                                "name": "database_host",
                                "value": "ip-172-31-20-167.eu-west-1.compute.internal"
                            },
                            {
                                "name": "database_password",
                                "value": "password"
                            },
                            {
                                "name": "database_type",
                                "value": "mysql"
                            },
                            {
                                "name": "hive_service",
                                "value": "hive"
                            },
                            {
                                "name": "hue_webhdfs",
                                "value": "hdfs-HTTPFS-e72052cbc4e0802c59a4b7cb8cd2020b"
                            },
                            {
                                "name": "oozie_service",
                                "value": "oozie"
                            },
                            {
                                "name": "zookeeper_service",
                                "value": "zookeeper"
                            }
                        ],
                        "roleTypeConfigs": []
                    },
                    "displayName": "Hue",
                    "name": "hue",
                    "roles": [
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "1onltfrkx7xc8xbok17vhiel5"
                                    },
                                    {
                                        "name": "secret_key",
                                        "value": "td0DjH7C8HcbCqOTbnkAobwiej1cZY"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                            },
                            "name": "hue-HUE_SERVER-d1df3eaf79374cb8266dbfd9471fc8b3",
                            "type": "HUE_SERVER"
                        }
                    ],
                    "type": "HUE"
                },
                {
                    "config": {
                        "items": [
                            {
                                "name": "hive_service",
                                "value": "hive"
                            },
                            {
                                "name": "mapreduce_yarn_service",
                                "value": "yarn"
                            },
                            {
                                "name": "zookeeper_service",
                                "value": "zookeeper"
                            }
                        ],
                        "roleTypeConfigs": [
                            {
                                "items": [
                                    {
                                        "name": "oozie_database_host",
                                        "value": "ip-172-31-20-167.eu-west-1.compute.internal"
                                    },
                                    {
                                        "name": "oozie_database_password",
                                        "value": "password"
                                    },
                                    {
                                        "name": "oozie_database_type",
                                        "value": "mysql"
                                    },
                                    {
                                        "name": "oozie_database_user",
                                        "value": "oozie"
                                    },
                                    {
                                        "name": "oozie_java_heapsize",
                                        "value": "606076928"
                                    }
                                ],
                                "roleType": "OOZIE_SERVER"
                            }
                        ]
                    },
                    "displayName": "Oozie",
                    "name": "oozie",
                    "roles": [
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "6ma93yd8sko2dwraf9k93oa03"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                            },
                            "name": "oozie-OOZIE_SERVER-d1df3eaf79374cb8266dbfd9471fc8b3",
                            "type": "OOZIE_SERVER"
                        }
                    ],
                    "type": "OOZIE"
                },
                {
                    "config": {
                        "items": [
                            {
                                "name": "hdfs_service",
                                "value": "hdfs"
                            },
                            {
                                "name": "rm_dirty",
                                "value": "false"
                            },
                            {
                                "name": "rm_last_allocation_percentage",
                                "value": "90"
                            },
                            {
                                "name": "yarn_service_cgroups",
                                "value": "false"
                            },
                            {
                                "name": "yarn_service_lce_always",
                                "value": "false"
                            },
                            {
                                "name": "zk_authorization_secret_key",
                                "value": "1bP1aak1m8cAZw9Rehc50rZ8Juf6OI"
                            },
                            {
                                "name": "zookeeper_service",
                                "value": "zookeeper"
                            }
                        ],
                        "roleTypeConfigs": [
                            {
                                "items": [
                                    {
                                        "name": "mapred_reduce_tasks",
                                        "value": "8"
                                    },
                                    {
                                        "name": "mapred_submit_replication",
                                        "value": "2"
                                    }
                                ],
                                "roleType": "GATEWAY"
                            },
                            {
                                "items": [
                                    {
                                        "name": "mr2_jobhistory_java_heapsize",
                                        "value": "606076928"
                                    }
                                ],
                                "roleType": "JOBHISTORY"
                            },
                            {
                                "items": [
                                    {
                                        "name": "yarn_nodemanager_heartbeat_interval_ms",
                                        "value": "100"
                                    },
                                    {
                                        "name": "yarn_nodemanager_local_dirs",
                                        "value": "/yarn/nm"
                                    },
                                    {
                                        "name": "yarn_nodemanager_log_dirs",
                                        "value": "/yarn/container-logs"
                                    },
                                    {
                                        "name": "yarn_nodemanager_resource_cpu_vcores",
                                        "value": "4"
                                    },
                                    {
                                        "name": "yarn_nodemanager_resource_memory_mb",
                                        "value": "3730"
                                    }
                                ],
                                "roleType": "NODEMANAGER"
                            },
                            {
                                "items": [
                                    {
                                        "name": "resource_manager_java_heapsize",
                                        "value": "606076928"
                                    },
                                    {
                                        "name": "yarn_scheduler_maximum_allocation_mb",
                                        "value": "4481"
                                    },
                                    {
                                        "name": "yarn_scheduler_maximum_allocation_vcores",
                                        "value": "3"
                                    }
                                ],
                                "roleType": "RESOURCEMANAGER"
                            }
                        ]
                    },
                    "displayName": "YARN (MR2 Included)",
                    "name": "yarn",
                    "roles": [
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "9tns27zoi9kztgjkgumy70bdj"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                            },
                            "name": "yarn-JOBHISTORY-d1df3eaf79374cb8266dbfd9471fc8b3",
                            "type": "JOBHISTORY"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "dsf39f4lpditmv8volpxhpt4n"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "9c98b3cb-44f6-4ebe-a8fc-f5eed1064b79"
                            },
                            "name": "yarn-NODEMANAGER-46cc11d7ffb089c0fd9ceee1e7cd7aee",
                            "type": "NODEMANAGER"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "40gsnwsgsdux75usztiox956w"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "869bef5f-2bb0-4d0f-a6d7-4d0603bb7d05"
                            },
                            "name": "yarn-NODEMANAGER-7dc40c2da35f7ee4a9eaeded6a930e68",
                            "type": "NODEMANAGER"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "ao8vyscfwbr5gu62x0o2iq7di"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "eed33878-d199-414a-bd88-5a4f1c22f5de"
                            },
                            "name": "yarn-NODEMANAGER-927e3aed987ad36059519fb5335314f9",
                            "type": "NODEMANAGER"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "12ljdrotuo8u0oiioco74iunf"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "0657ea58-bf84-4c00-ad33-b889be37a5bc"
                            },
                            "name": "yarn-NODEMANAGER-e72052cbc4e0802c59a4b7cb8cd2020b",
                            "type": "NODEMANAGER"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "rm_id",
                                        "value": "53"
                                    },
                                    {
                                        "name": "role_jceks_password",
                                        "value": "cs962rf2wsn0gbvr0sim2l3ff"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                            },
                            "name": "yarn-RESOURCEMANAGER-d1df3eaf79374cb8266dbfd9471fc8b3",
                            "type": "RESOURCEMANAGER"
                        }
                    ],
                    "type": "YARN"
                },
                {
                    "config": {
                        "items": [
                            {
                                "name": "dfs_ha_fencing_cloudera_manager_secret_key",
                                "value": "qgCCZmYpiiUuXb4u1cqxxI4Oara0Ov"
                            },
                            {
                                "name": "dfs_ha_fencing_methods",
                                "value": "shell(true)"
                            },
                            {
                                "name": "fc_authorization_secret_key",
                                "value": "CuNmiFOCtxoEwPbiq91Rs4eZM8EBqJ"
                            },
                            {
                                "name": "http_auth_signature_secret",
                                "value": "lyEKUaDOp5a21XXONw2BwWiV4mwlmf"
                            },
                            {
                                "name": "rm_dirty",
                                "value": "false"
                            },
                            {
                                "name": "rm_last_allocation_percentage",
                                "value": "10"
                            },
                            {
                                "name": "zookeeper_service",
                                "value": "zookeeper"
                            }
                        ],
                        "roleTypeConfigs": [
                            {
                                "items": [
                                    {
                                        "name": "balancer_java_heapsize",
                                        "value": "606076928"
                                    }
                                ],
                                "roleType": "BALANCER"
                            },
                            {
                                "items": [
                                    {
                                        "name": "dfs_data_dir_list",
                                        "value": "/dfs/dn"
                                    },
                                    {
                                        "name": "dfs_datanode_du_reserved",
                                        "value": "8441736396"
                                    },
                                    {
                                        "name": "dfs_datanode_max_locked_memory",
                                        "value": "4294967296"
                                    }
                                ],
                                "roleType": "DATANODE"
                            },
                            {
                                "items": [
                                    {
                                        "name": "dfs_client_use_trash",
                                        "value": "true"
                                    }
                                ],
                                "roleType": "GATEWAY"
                            },
                            {
                                "items": [
                                    {
                                        "name": "dfs_journalnode_edits_dir",
                                        "value": "/dfs/jn"
                                    }
                                ],
                                "roleType": "JOURNALNODE"
                            },
                            {
                                "items": [
                                    {
                                        "name": "dfs_name_dir_list",
                                        "value": "/dfs/nn"
                                    },
                                    {
                                        "name": "dfs_namenode_servicerpc_address",
                                        "value": "8022"
                                    },
                                    {
                                        "name": "namenode_java_heapsize",
                                        "value": "606076928"
                                    }
                                ],
                                "roleType": "NAMENODE"
                            },
                            {
                                "items": [
                                    {
                                        "name": "fs_checkpoint_dir_list",
                                        "value": "/dfs/snn"
                                    },
                                    {
                                        "name": "secondary_namenode_java_heapsize",
                                        "value": "606076928"
                                    }
                                ],
                                "roleType": "SECONDARYNAMENODE"
                            }
                        ]
                    },
                    "displayName": "HDFS",
                    "name": "hdfs",
                    "roles": [
                        {
                            "config": {
                                "items": []
                            },
                            "hostRef": {
                                "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                            },
                            "name": "hdfs-BALANCER-d1df3eaf79374cb8266dbfd9471fc8b3",
                            "type": "BALANCER"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "8dvfmkj7gt7c79u5tj22evxcs"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "9c98b3cb-44f6-4ebe-a8fc-f5eed1064b79"
                            },
                            "name": "hdfs-DATANODE-46cc11d7ffb089c0fd9ceee1e7cd7aee",
                            "type": "DATANODE"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "f107jrnihpuwbiovotdgk8bx7"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "869bef5f-2bb0-4d0f-a6d7-4d0603bb7d05"
                            },
                            "name": "hdfs-DATANODE-7dc40c2da35f7ee4a9eaeded6a930e68",
                            "type": "DATANODE"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "1mtzn6qqit5qe76bmophr7owu"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "eed33878-d199-414a-bd88-5a4f1c22f5de"
                            },
                            "name": "hdfs-DATANODE-927e3aed987ad36059519fb5335314f9",
                            "type": "DATANODE"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "38chr63i8kpu179xo16cfpxy7"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "0657ea58-bf84-4c00-ad33-b889be37a5bc"
                            },
                            "name": "hdfs-DATANODE-e72052cbc4e0802c59a4b7cb8cd2020b",
                            "type": "DATANODE"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "6d2f83uka5taxyai4axs0slvp"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                            },
                            "name": "hdfs-FAILOVERCONTROLLER-d1df3eaf79374cb8266dbfd9471fc8b3",
                            "type": "FAILOVERCONTROLLER"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "4sl8or7zdx03iqyn41qxyyagm"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "0657ea58-bf84-4c00-ad33-b889be37a5bc"
                            },
                            "name": "hdfs-FAILOVERCONTROLLER-e72052cbc4e0802c59a4b7cb8cd2020b",
                            "type": "FAILOVERCONTROLLER"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "3ske2pq1bnz6jl55dz55ki1hx"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "0657ea58-bf84-4c00-ad33-b889be37a5bc"
                            },
                            "name": "hdfs-HTTPFS-e72052cbc4e0802c59a4b7cb8cd2020b",
                            "type": "HTTPFS"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "26tsowav8zslfqfiw48j7fc7t"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "9c98b3cb-44f6-4ebe-a8fc-f5eed1064b79"
                            },
                            "name": "hdfs-JOURNALNODE-46cc11d7ffb089c0fd9ceee1e7cd7aee",
                            "type": "JOURNALNODE"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "vsqax3fppd7rnu8q68hsy8zl"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "869bef5f-2bb0-4d0f-a6d7-4d0603bb7d05"
                            },
                            "name": "hdfs-JOURNALNODE-7dc40c2da35f7ee4a9eaeded6a930e68",
                            "type": "JOURNALNODE"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "role_jceks_password",
                                        "value": "em61dpwcmsk2o8flf8204xspb"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "eed33878-d199-414a-bd88-5a4f1c22f5de"
                            },
                            "name": "hdfs-JOURNALNODE-927e3aed987ad36059519fb5335314f9",
                            "type": "JOURNALNODE"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "autofailover_enabled",
                                        "value": "true"
                                    },
                                    {
                                        "name": "dfs_federation_namenode_nameservice",
                                        "value": "nameservice1"
                                    },
                                    {
                                        "name": "dfs_namenode_quorum_journal_name",
                                        "value": "nameservice1"
                                    },
                                    {
                                        "name": "namenode_id",
                                        "value": "55"
                                    },
                                    {
                                        "name": "role_jceks_password",
                                        "value": "18fuyxrywtgain97r3ba1byyf"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                            },
                            "name": "hdfs-NAMENODE-d1df3eaf79374cb8266dbfd9471fc8b3",
                            "type": "NAMENODE"
                        },
                        {
                            "config": {
                                "items": [
                                    {
                                        "name": "autofailover_enabled",
                                        "value": "true"
                                    },
                                    {
                                        "name": "dfs_federation_namenode_nameservice",
                                        "value": "nameservice1"
                                    },
                                    {
                                        "name": "dfs_namenode_quorum_journal_name",
                                        "value": "nameservice1"
                                    },
                                    {
                                        "name": "namenode_id",
                                        "value": "61"
                                    },
                                    {
                                        "name": "role_jceks_password",
                                        "value": "2lx65772pu3g8mw8k3g41k928"
                                    }
                                ]
                            },
                            "hostRef": {
                                "hostId": "0657ea58-bf84-4c00-ad33-b889be37a5bc"
                            },
                            "name": "hdfs-NAMENODE-e72052cbc4e0802c59a4b7cb8cd2020b",
                            "type": "NAMENODE"
                        }
                    ],
                    "type": "HDFS"
                }
            ],
            "version": "CDH5"
        }
    ],
    "hosts": [
        {
            "config": {
                "items": []
            },
            "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410",
            "hostname": "ip-172-31-18-176.eu-west-1.compute.internal",
            "ipAddress": "172.31.18.176",
            "rackId": "/default"
        },
        {
            "config": {
                "items": []
            },
            "hostId": "0657ea58-bf84-4c00-ad33-b889be37a5bc",
            "hostname": "ip-172-31-19-166.eu-west-1.compute.internal",
            "ipAddress": "172.31.19.166",
            "rackId": "/default"
        },
        {
            "config": {
                "items": []
            },
            "hostId": "eed33878-d199-414a-bd88-5a4f1c22f5de",
            "hostname": "ip-172-31-20-167.eu-west-1.compute.internal",
            "ipAddress": "172.31.20.167",
            "rackId": "/default"
        },
        {
            "config": {
                "items": []
            },
            "hostId": "9c98b3cb-44f6-4ebe-a8fc-f5eed1064b79",
            "hostname": "ip-172-31-22-18.eu-west-1.compute.internal",
            "ipAddress": "172.31.22.18",
            "rackId": "/default"
        },
        {
            "config": {
                "items": []
            },
            "hostId": "869bef5f-2bb0-4d0f-a6d7-4d0603bb7d05",
            "hostname": "ip-172-31-27-120.eu-west-1.compute.internal",
            "ipAddress": "172.31.27.120",
            "rackId": "/default"
        }
    ],
    "managementService": {
        "config": {
            "items": [],
            "roleTypeConfigs": [
                {
                    "items": [
                        {
                            "name": "event_server_heapsize",
                            "value": "606076928"
                        }
                    ],
                    "roleType": "EVENTSERVER"
                },
                {
                    "items": [
                        {
                            "name": "firehose_heapsize",
                            "value": "606076928"
                        },
                        {
                            "name": "firehose_non_java_memory_bytes",
                            "value": "805306368"
                        }
                    ],
                    "roleType": "HOSTMONITOR"
                },
                {
                    "items": [
                        {
                            "name": "headlamp_database_host",
                            "value": "ip-172-31-20-167.eu-west-1.compute.internal"
                        },
                        {
                            "name": "headlamp_database_name",
                            "value": "rman"
                        },
                        {
                            "name": "headlamp_database_password",
                            "value": "password"
                        },
                        {
                            "name": "headlamp_database_user",
                            "value": "rman"
                        },
                        {
                            "name": "headlamp_heapsize",
                            "value": "606076928"
                        }
                    ],
                    "roleType": "REPORTSMANAGER"
                },
                {
                    "items": [
                        {
                            "name": "firehose_heapsize",
                            "value": "606076928"
                        },
                        {
                            "name": "firehose_non_java_memory_bytes",
                            "value": "805306368"
                        }
                    ],
                    "roleType": "SERVICEMONITOR"
                }
            ]
        },
        "displayName": "Cloudera Management Service",
        "name": "mgmt",
        "roles": [
            {
                "config": {
                    "items": [
                        {
                            "name": "role_jceks_password",
                            "value": "3c0j9aza5ffqhmsc2rwyfa1b3"
                        }
                    ]
                },
                "hostRef": {
                    "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                },
                "name": "mgmt-ALERTPUBLISHER-d1df3eaf79374cb8266dbfd9471fc8b3",
                "type": "ALERTPUBLISHER"
            },
            {
                "config": {
                    "items": [
                        {
                            "name": "role_jceks_password",
                            "value": "51tbduzdb11n266x4ni7ljxz4"
                        }
                    ]
                },
                "hostRef": {
                    "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                },
                "name": "mgmt-EVENTSERVER-d1df3eaf79374cb8266dbfd9471fc8b3",
                "type": "EVENTSERVER"
            },
            {
                "config": {
                    "items": [
                        {
                            "name": "role_jceks_password",
                            "value": "5vw0wr6qskk5t04dugfi4b0ft"
                        }
                    ]
                },
                "hostRef": {
                    "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                },
                "name": "mgmt-HOSTMONITOR-d1df3eaf79374cb8266dbfd9471fc8b3",
                "type": "HOSTMONITOR"
            },
            {
                "config": {
                    "items": [
                        {
                            "name": "role_jceks_password",
                            "value": "1m6kj7ag85coak5fdhmmx7n95"
                        }
                    ]
                },
                "hostRef": {
                    "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                },
                "name": "mgmt-REPORTSMANAGER-d1df3eaf79374cb8266dbfd9471fc8b3",
                "type": "REPORTSMANAGER"
            },
            {
                "config": {
                    "items": [
                        {
                            "name": "role_jceks_password",
                            "value": "ba0sq7ze4b797cdma9m32gxrh"
                        }
                    ]
                },
                "hostRef": {
                    "hostId": "8efba45d-fd2b-48b4-9693-0faccfc5b410"
                },
                "name": "mgmt-SERVICEMONITOR-d1df3eaf79374cb8266dbfd9471fc8b3",
                "type": "SERVICEMONITOR"
            }
        ],
        "type": "MGMT"
    },
    "managerSettings": {
        "items": [
            {
                "name": "CLUSTER_STATS_START",
                "value": "10/21/2012 13:30"
            },
            {
                "name": "PUBLIC_CLOUD_STATUS",
                "value": "ON_PUBLIC_CLOUD"
            },
            {
                "name": "REMOTE_PARCEL_REPO_URLS",
                "value": "https://archive.cloudera.com/cdh5/parcels/{latest_supported}/,https://archive.cloudera.com/cdh4/parcels/latest/,https://archive.cloudera.com/impala/parcels/latest/,https://archive.cloudera.com/search/parcels/latest/,https://archive.cloudera.com/accumulo/parcels/1.4/,https://archive.cloudera.com/accumulo-c5/parcels/latest/,https://archive.cloudera.com/kafka/parcels/latest/,https://archive.cloudera.com/navigator-keytrustee5/parcels/latest/,https://archive.cloudera.com/spark/parcels/latest/,https://archive.cloudera.com/sqoop-connectors/parcels/latest/,http://ip-172-31-20-167.eu-west-1.compute.internal:80/cdh5.9"
            }
        ]
    },
    "timestamp": "2017-03-08T09:57:53.374Z",
    "users": [
        {
            "name": "__cloudera_internal_user__618523e1-c3a0-46f4-b168-af47242958ef",
            "pwHash": "37c076d62e280896cdb166cb724dc408b78d18c1b52c04a1725422174e0b229e",
            "pwLogin": true,
            "pwSalt": -2454426157885262511,
            "roles": [
                "ROLE_USER"
            ]
        },
        {
            "name": "__cloudera_internal_user__mgmt-EVENTSERVER-d1df3eaf79374cb8266dbfd9471fc8b3",
            "pwHash": "646959f1e2746dc3c5cfdbd598e23b4baa012c3eaf4c998f561b6fdfc17c3216",
            "pwLogin": true,
            "pwSalt": -8602790926219138749,
            "roles": [
                "ROLE_USER"
            ]
        },
        {
            "name": "__cloudera_internal_user__mgmt-HOSTMONITOR-d1df3eaf79374cb8266dbfd9471fc8b3",
            "pwHash": "db79042077015b6ca5b3e9ba837d3d67b0d5a17be949d7baa8a869c9f93e8268",
            "pwLogin": true,
            "pwSalt": -4794428824935572830,
            "roles": [
                "ROLE_USER"
            ]
        },
        {
            "name": "__cloudera_internal_user__mgmt-REPORTSMANAGER-d1df3eaf79374cb8266dbfd9471fc8b3",
            "pwHash": "67f8bbf04cbbadb724796ca8a7f18b1f588258bcc122a53e744b848e89d8e8e8",
            "pwLogin": true,
            "pwSalt": -8860816676190532541,
            "roles": [
                "ROLE_USER"
            ]
        },
        {
            "name": "__cloudera_internal_user__mgmt-SERVICEMONITOR-d1df3eaf79374cb8266dbfd9471fc8b3",
            "pwHash": "e723723f3d3cf870a702c7d441f9d3bd613bd0a53ca2dd07523382f44dad4287",
            "pwLogin": true,
            "pwSalt": -7701147252384712525,
            "roles": [
                "ROLE_USER"
            ]
        },
        {
            "name": "admin",
            "pwHash": "1c68ba1e8ffe82a83637ce31546f83b0bafc753b2288b20aca8e0ce1c45ec341",
            "pwLogin": true,
            "pwSalt": 2289818339778406853,
            "roles": [
                "ROLE_LIMITED"
            ]
        },
        {
            "name": "joseluisvf",
            "pwHash": "9ece9d06ce79639641037c13547db293c2765b5b2f8f025de0516f6b9509aca4",
            "pwLogin": true,
            "pwSalt": -5506896895951025098,
            "roles": [
                "ROLE_ADMIN"
            ]
        },
        {
            "name": "minotaur",
            "pwHash": "df6729c79575037539ca689c951c2b77078472464aa1b6bf6f7741c3ba5ec12b",
            "pwLogin": true,
            "pwSalt": -6585721280205593720,
            "roles": [
                "ROLE_CONFIGURATOR"
            ]
        }
    ],
    "versionInfo": {
        "buildTimestamp": "20161019-1014",
        "buildUser": "jenkins",
        "gitHash": "518f0d6d44abc87bc392646e4369a20c8192b7cf",
        "snapshot": false,
        "version": "5.8.3"
    }
}
```
