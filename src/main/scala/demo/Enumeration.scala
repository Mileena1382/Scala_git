package demo

object Enumeration {
  def main(args:Array[String]):Unit= {


    println("create an enumeration")
    object Donut extends Enumeration {
      type Donut = Value

      val Glazed = Value("Glazed")
      val Strawberry = Value("Strawberry")
      val Plain = Value("Plain")
      val Vanilla = Value("Vanilla")
    }
    println("print the String value of the enumeration")
    println(s"Vanilla Donut string value = ${Donut.Vanilla}")

    println("print the id  of the enumeration")
    println(s"Vanilla Donut id = ${Donut.Vanilla.id}")

    println("print all the values listed in Enumeration")
    println(s"Donut types = ${Donut.values}")

    println("How to pattern match on enumeration values")
    Donut.values.foreach {
      case d if (d == Donut.Strawberry || d == Donut.Glazed) => println(s"Found favourite donut = $d")
      case _ => None
    }
    println("change the default ordering of enumeration values")
    object DonutTaste extends Enumeration{
      type DonutTaste = Value

      val Tasty       = Value(0, "Tasty")
      val VeryTasty   = Value(1, "Very Tasty")
      val Ok          = Value(-1, "Ok") // Ok element moved to the front
    }

    println(s"Donut taste values = ${DonutTaste.values}")
    println(s"Donut taste of OK id = ${DonutTaste.Ok.id}")

  }


}
