import org.apache.spark
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.functions.col
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.{DataFrame, SparkSession}

object Spark {

  def loadData(): DataFrame = {
    // create spark configuration and spark context: the Spark context is the entry point in Spark.
    // It represents the connexion to Spark and it is the place where you can configure the common properties
    // like the app name, the master url, memories allocation...
    val conf = new SparkConf()
      .setAppName("Wordcount")
      .setMaster("local[*]") // here local mode. And * means you will use as much as you have cores.

    val ss = SparkSession.builder()
      .config(conf)
      .getOrCreate()

    ss.read.options(Map("header" -> "true", "inferSchema"->"true", "delimiter"->",")).csv("testdd.csv")
  }


  def firstlook(): Unit = {
    loadData().show()
  }

  def peacescorecount(): Unit = {
    loadData().select("adress").show()
    val alertnumber = loadData().select("peacescore").filter("peacescore>50").count()
    println("Total count of alert " + alertnumber)

  }


}
