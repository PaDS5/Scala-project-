import scala.collection.mutable


object helloworld {
  def main(args: Array[String]): Unit = {
    println("Hello world")
    val temp = mutable.HashMap(("1", 50), ("2", 78), ("3", 23))
    val reporttest = DroneReport.Drone(120, 15.4856854, 3.4521684, List("Bien", "Mauvais", "Nul"),temp)
    println("Information du rapport du drone ", reporttest)
  }

}
