package demo

object Functions {
  def main(args:Array[String]):Unit={
    println("Function")
    def favDonut(): String={
    "Glazed donut"
    }
    val myFavDonut=favDonut()
    println(s"Fav donut is $myFavDonut")


    println("to define and use a function with no parenthesis")
    def leastFavoriteDonut = "Plain Donut"
    println(s"My least favorite donut is $leastFavoriteDonut")

    println("define and use a function with no return type")
    def printSalesReport():Unit={
      println("Printing")
    }
    printSalesReport()


    //Function with parameters
    println("Function with parameter")
    def donutCost(donutName:String,quantity:Int):Double={
      println(s"calculating cost for $donutName, quantity = $quantity")
      25*quantity
    }
    println("How to call a function with parameters")
    val totalCost = donutCost("Glazed Donut", 5) //stored the value which is returned from our donutCost function into an immutable variable called totalCost
    println(s"Total cost of donuts = $totalCost")

    println("\nStep 3: How to add default values to function parameters")
    def donutCost2(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
      println(s"Calculating cost for $donutName, quantity = $quantity, couponCode = $couponCode")
      // make some calculations ...
      2.50 * quantity
    }
    println("call a function with parameters that has default values")
    val totalCostWithDiscount = donutCost2("Glazed Donut", 4, "COUPON_12345")
    val totalCostWithoutDiscount =donutCost2("Glazed Donut", 4)



    //  Option in function parameters
    println("Step 1: How to define an Option in a function parameter")
    def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String]): Unit = {
      println(s"Calculating cost for $donutName, quantity = $quantity")

      couponCode match {
        case Some(coupon) =>
          val discount = 0.1 // Let's simulate a 10% discount
          val totalCost = 2.50 * quantity * (1 - discount)
          totalCost

        case None => 2.50 * quantity


      }

    }
    println("Step 2: How to call a function which has an Option parameter")
    println(s"""Total cost = ${calculateDonutCost("Glazed Donut", 5, None)}""")


    //Function with option return type
    println(s"Define a function which returns an Option of type String")
    def dailyCouponCode(): Option[String] = {
      // look up in database if we will provide our customers with a coupon today
      val couponFromDb = "COUPON_1234"
      Option(couponFromDb).filter(_.nonEmpty)
    }
    println(s"Call function with Option return type using getOrElse")
    val todayCoupon:Option[String]=dailyCouponCode()
    println(s"Today's coupon code=${todayCoupon.getOrElse("No coupons")}")

     //Call func using pattern matching
    println(s"Call function with Option return type using pattern matching")
    dailyCouponCode() match{
      case Some(couponCode) =>println(s"Todays coupon code=$couponCode")
      case None=>println(s"No coupon code")
    }

    //When using the getOrElse() function or pattern matching on a function which returns an Option, you will need to provide the default or None case
    //If valid values only needed use map()
    println(s"Call function with Option return type using map")
    dailyCouponCode().map(couponCode => println(s"Today's coupon code = $couponCode"))

    //Function which has an implicit parameter
    println(s"Step 1: How to define a function with an implicit parameter")
    def totalCost1(donutType: String, quantity: Int)(implicit discount: Double): Double = {
      println(s"Calculating the price for $quantity $donutType")
      val totalCost1 = 2.50 * quantity * (1 - discount)
      totalCost1
    }

    println("\nStep 2: How to define an implicit value")
    implicit val discount: Double = 0.1
    println(s"All customer will receive a ${discount * 100}% discount")
    println("\nStep 3: How to call a function which has an implicit parameter")
    println(s"""Total cost with discount of 5 Glazed Donuts = ${totalCost1("Glazed Donut", 5)}""")


    println("\nStep 4: How to define a function which takes multiple implicit parameters")
    def totalCost2(donutType: String, quantity: Int)(implicit discount: Double, storeName: String): Double = {
      println(s"[$storeName] Calculating the price for $quantity $donutType")
      val totalCost = 2.50 * quantity * (1 - discount)
      totalCost
    }
    println("\nStep 5: How to call a function which takes multiple implicit parameters")
    implicit val storeName: String = "Tasty Donut Store"
    println(s"""Total cost with discount of 5 Glazed Donuts = ${totalCost2("Glazed Donut", 5)}""")

    println("\nStep 6: How to manually pass-through implicit parameters")
    println(s"""Total cost with discount of 5 Glazed Donuts, manually passed-through = ${totalCost2("Glazed Donut", 5)(0.1, "Scala Donut Store")}""")
  }

}
