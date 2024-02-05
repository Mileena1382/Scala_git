package demo

object Variables {
  def main(args:Array[String]):Unit={
    //Mutable Variable: values can be changed after initialization
    var favDonut:String="Glazed Donut"
    favDonut="Vanilla"
    println(favDonut)

    //Immutable Variables: values cannot be changed
    val immutableVariable:Int=43
    //immutableVariable=99
    // shows "Reassignment to val" meaning once a value has been assigned, cant cahnge it
    println(immutableVariable)


    //Escape JSON format
    //Use \ before quotes
    println("Step 1: How to escape a Json String")
    val donutJson: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
    println(s"donutJson=$donutJson")

    //This method is time consuming.So wrap text within triple quotes
    println("Use triple quotes to escape characters")
    val donutJson2:String="""{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
    println(s"donutJson2=$donutJson2")

    //Creating multi-line text using stripMargin
    val donutJson3:String=
      """
        |{"donut_name":"Glazed Donut",
        |"taste_level":"Very Tasty",
        |"price":2.50
        |}
        |""".stripMargin
    println(s"donutJson3=$donutJson3")

    //Type Inference
    //Doesnt need to specify the type

    val donuts=23
    println(s"No of donuts is $donuts")

    // Conversion of 1 data type to another
    val numOfDonuts:Short=2
    val minDonuts:Int=numOfDonuts // Converting from short to int
    //It is fine because int is larger than Short
    println(s"Min num of donuts is $minDonuts")

    //User driven type conversion
    //Converting int to string
    //Using toString() function since direct conversion not possible
    val numOfDonuts1:Int=5
    val minDonuts1:String=numOfDonuts1.toString()
    println(s"Minimum number of donuts is $minDonuts1")


  }

}
