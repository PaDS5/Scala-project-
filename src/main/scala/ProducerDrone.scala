import org.apache.kafka.clients.producer._
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
import scala.util.Random
import java.util.Properties

object ProducerDrone extends App {
  def test(identity:DroneReport.Identity,drone: DroneReport.Drone): Unit = {
    val topic = "testtopic"

    val iden: String = identity.firstname + "-" + identity.lastname + "-(" + drone.lat_location + "," + drone.long_location + ")"
    val rand = scala.util.Random
    val score = rand.nextInt(100)
    val props = new Properties()
    props.put("bootstrap.servers", "localhost:9092")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.IntegerSerializer")


    val producer = new KafkaProducer[String, Int](props)
    val record = new ProducerRecord(topic, iden, score)
    producer.send(record)
    producer.close()
  }




}

