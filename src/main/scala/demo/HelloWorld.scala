package demo

object HelloWorld {
  def main(args:Array[String]):Unit={
    println("Hello World") // print hello world

    // Variables
    //Mutable Variable
//    var favDonut:String="Glazed Donut"
//    favDonut="Vanilla"

    val place:String="Bengaluru"
    println(s"My place is $place")
    case class Donut(name:String,taste:String)
    val favDonut:Donut=Donut("Glazed","Good")
    println(s"My fav donut is ${favDonut.name},taste is ${favDonut.taste}")
  }

}
