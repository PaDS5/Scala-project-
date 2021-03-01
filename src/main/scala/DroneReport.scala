import scala.collection.mutable
import scala.collection.mutable.HashMap

object DroneReport {
  case class Drone(
                    id : Int,
                    lat_location : Double,
                    long_location : Double,
                    words : List[String],
                    surround : mutable.HashMap[String, Int]
  )

}
