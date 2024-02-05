package demo

object Functions2 {
  def main(args:Array[String]):Unit={

    //Implicit function
    println("create a wrapper String class which will extend the String type")
    class DonutString(s: String) {

      def isFavoriteDonut: Boolean = s == "Glazed Donut" // compare two Strings using ==

    }
    println("\nStep 2: How to create an implicit function to convert a String to the wrapper String class")
    object DonutConverstions {
      implicit def stringToDonutString(s: String) = new DonutString(s)
    }
    println("\nStep 3: How to import the String conversion so that it is in scope")
    import DonutConverstions._
    println("\nStep 4: How to create String values")
    val glazedDonut = "Glazed Donut"
    val vanillaDonut = "Vanilla Donut"
    println("\nStep 5: How to access the custom String function called isFavaoriteDonut")
    println(s"Is Glazed Donut my favorite Donut = ${glazedDonut.isFavoriteDonut}")
    println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavoriteDonut}")



    //TYped functions
    //allow us to specify the types of the parameters when calling the function.
    println("Step 1: How to define a function which takes a String parameter")
    def applyDiscount(couponCode: String) {
      println(s"Lookup percentage discount in database for $couponCode")
    }

    println("\nStep 2: How to define a function which takes a parameter of type Double")
    def applyDiscount2(percentageDiscount: Double) {
      println(s"$percentageDiscount discount will be applied")
    }
    println("\nStep 3: Calling applyDiscount function with String or Double parameter types")
    applyDiscount("COUPON_1234")


  }



}
