import scala.sys.process._

object HiveCurlExample extends App {
	val check = Seq("curl", "-u", "joseluisvf:cloudera", "-X", "GET", "http://34.251.235.171:7180/api/v12/clusters/joseluisvf/services/hive")
	val start = Seq("curl", "-u", "joseluisvf:cloudera", "-X", "POST", "http://34.251.235.171:7180/api/v12/clusters/joseluisvf/services/hive/commands/start")
	val stop = Seq("curl", "-u", "joseluisvf:cloudera", "-X", "POST", "http://34.251.235.171:7180/api/v12/clusters/joseluisvf/services/hive/commands/stop")
	


	checkHiveStatus
	stopHive
	waitUntilHiveIsStopped
	startHive
	waitUntilHiveIsStarted

	def checkHiveStatus = {
		println(check.!!)
	}

	def stopHive = {
		println(stop.!!)
	}

	def waitUntilHiveIsStopped = {
		println("Waiting until Hive service is stopped (checking every 3 seconds)")
		while(!check.!!.contains("\"serviceState\" : \"STOPPED\"")){
			Thread.sleep(3 * 1000)
		}
		println("Hive is stopped!")	

	}

	def startHive = {
		start.!!
	}

	def waitUntilHiveIsStarted = {
		println("Waiting until Hive service is started (checking every 10 seconds)")
		while(!check.!!.contains("\"serviceState\" : \"STARTED\"")){
			Thread.sleep(10 * 1000)
		}
		println("Hive is started!")	

	}
}

