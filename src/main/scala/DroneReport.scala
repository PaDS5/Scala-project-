
import scala.collection.immutable.HashMap

object DroneReport {

  case class Identity(
                     firstname: String,
                     lastname: String,
                     adress: String,
                     )

  case class Drone(
                    id : Int,
                    lat_location : Double,
                    long_location : Double,
                    words : List[String],
                    surround : HashMap[Identity, Int]
  )

}
