import DroneReport.Identity
import DroneReport.Drone

import scala.collection.mutable
import scala.collection.immutable.HashMap


object helloworld {
  def main(args: Array[String]): Unit = {

    val person = Identity("louis", "Dupont", "30 Avenue des Champs-Elysées")

    val temp = HashMap((person, 50))

    val reporttest = Drone(120, 15.4856854, 3.4521684, List("Bien", "Mauvais", "Nul"),temp)
    println("Information du rapport du drone ", reporttest)

    ProducerDrone.test(person, reporttest)
    ConsumerDrone.test()

  }

}
