import DroneReport.Identity

import scala.collection.mutable


object helloworld {
  def main(args: Array[String]): Unit = {

    val person = Identity("louis", "Dupont", "30 Avenue des Champs-Elysées")

    val temp = mutable.HashMap((person, 50))

    val reporttest = DroneReport.Drone(120, 15.4856854, 3.4521684, List("Bien", "Mauvais", "Nul"),temp)
    println("Information du rapport du drone ", reporttest)
  }

}
