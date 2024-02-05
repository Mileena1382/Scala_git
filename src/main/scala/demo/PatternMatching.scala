package demo

object PatternMatching {
  def main(args:Array[String]):Unit={
    println("Pattern matching") //Similar to switch but no break statements
    val donutType="Glazed" // declaring variable
    donutType match {
      case "Glazed" =>println("Very tasty")
      case "plain"  =>println("good")
    }
    val donutType2="plain"
    println("Pattern matching and return the result")
    val tastelevel=donutType2 match{
      case "glazed" =>"Very tasty"
      case "plain" =>"Good"
    }
    println(s"Tste of $donutType2 is $tastelevel")


     val donutType3="Strawberry"
     val tastelevel2=donutType3 match {
       case "glazed"|"Strawberry"=>"very tasty" // Using OR
       case "plain" =>"Tasty"
     }
    println(s"Taste level of $donutType3=$tastelevel2")

    println("Pattern matching and using if expression")
    val tastelevel3=donutType3 match{
      case donut if donut.contains("Glazed")||donut.contains("Strawberry") => "Good"
      case "plain" => "tasty"
    }
    println(s"Taste level of $donutType3=$tastelevel3")

    println("Pattern matching by types")
    val priceOfDonut:Any=2.50 // Any value can be assigned to variable type 'Any" regardless of its actual type
    val priceType=priceOfDonut match{
      case price:Int => "Int"
      case price: Double => "Double"
      case price: Float => "Float"
      case price: String => "String"
      case price: Boolean => "Boolean"
      case price: Char => "Char"
      case price: Long => "Long"
    }
    println(s"Donut price type=$priceType")


    //Tuples
    //Store elements as pairs
    println("Using Tuple2 to store 2 datapoints")
    val glazedTuple=Tuple2("Glazed donut","Very Tasty")
    println(s"Tuple is $glazedTuple")


    println("Access each element in tuple")
    val donutType4=glazedTuple._1
    val donutTaste=glazedTuple._2
    println(s"$donutType4 taste level is $donutTaste")


    println("using TupleN classes to store more than 2 data points")
    val glazedDonut = Tuple3("Glazed Donut", "Very Tasty", 2.50)
    println(s"${glazedDonut._1} taste level is ${glazedDonut._2} and it's price is ${glazedDonut._3}")


    println(" How to use pattern matching on Tuples")
    val strawberryDonut = Tuple3("Strawberry Donut", "Very Tasty", 2.50)
    val plainDonut = Tuple3("Plain Donut", "Tasty", 2)
    val donutList = List(glazedDonut, strawberryDonut, plainDonut) //Store donuts tuples into a list
    val priceOfPlainDonut = donutList.foreach { tuple => {
      tuple match {
        case ("Plain Donut", taste, price) => println(s"Donut type = Plain Donut, price = $price")
        case d if d._1 == "Glazed Donut" => println(s"Donut type = ${d._1}, price = ${d._3}")//extracts a local variable named d and will only match on Glazed Donut
        case _ => None//default case using the wildcard underscore _ and simply return None.
      }
    }
    }

    println("Step 5: Shortcut for creating Tuples")
    val chocolateDonut = ("Chocolate Donut", "Very Tasty", 3.0) // enclose within () to create tuples
    println(s"Chocolate donut taste level = ${chocolateDonut._2}, price = ${chocolateDonut._3}")



    //Option
    // avoid NullPointerException by using getOfElse() or Pattern Matching.
    //used to handle situations where a computation might or might not yield a result.
    // An Option can be either Some(value) if a value is present, or None if there is no value.
    println("Option and some")
    val glazedDonutTaste:Option[String]=Some("Very tasty") // some is a subtype of Option that represents the presence of a value.
    println(s"Glazed Donut taste = ${glazedDonutTaste.get}") // use get to retrieve its value


    //None
    println(" Option and None - a basic example")
    val glazedDonutName: Option[String] = None
    //If call the get(), you will get the exception java.util.NoSuchElementException: None.get.
    println(s"Glazed Donut name = ${glazedDonutName.getOrElse("Glazed Donut")}")//getOrElse()  function to get a default value in case your variable had no data.

    //
    println("use Pattern Matching with Option")
    glazedDonutName match {
      case Some(name) => println(s"Received donut name = $name")
      case None       => println(s"No donut name was found!")
    }
  }


}
