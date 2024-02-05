package demo

object IfElse {
  def main(args:Array[String]):Unit={
    println("Using if")
    val numOfPeople=12
    val donutsPerPerson=2
    val defaultDonuts=8
    //Storing the result of expression into a variable
    val numOfDonuts=if(numOfPeople>10)(numOfPeople*donutsPerPerson) else defaultDonuts
    println(s"Number of donuts to buy=$numOfDonuts")
    if(numOfPeople>10)
      println(s"Num of donuts to buy=${numOfPeople*donutsPerPerson}")
    else if(numOfPeople==0){
      println("No people,no need to buy")
    }

    else
    { println(s"Num of donuts to buy=$defaultDonuts")}


    // For loop
    println("For loop including last number")
    for(numOfDonuts<-1 to 5){ // keyword to used so 5 also included
      println(s"Number of donuts to buy=$numOfDonuts")


      println("For loop excluding last number")
      for(numOfDonuts<-1 until 5) { // keyword until is used,so 5 not included
        println(s"Num of donuts to buy=$numOfDonuts")

        println("Filter values using if in for loop")
        val donutIngredients = List("flour", "sugar", "egg", "syrup") // stored a list of ingredients in the variable
        for (ingredient <- donutIngredients if ingredient == "sugar") { //
          println(s"Found sweetening ingredient=$ingredient")
        }


        println("Filter values using if in for loop and return the result back using the yield keyword")
        val sweeteningIngredients = for {
          ingredient <- donutIngredients
          if (ingredient == "sugar" || ingredient == "syrup")
        } yield ingredient
        println(s"Sweetening ingredients=$sweeteningIngredients")
      }

    }
    //Using for loop comprehension to loop through 2-Dimensional Array
    val twoDimensionalArray = Array.ofDim[String](2,2) // Use ofDim() function , specify 2 by 2 array in func paramater
    twoDimensionalArray(0)(0)="flour"
    twoDimensionalArray(0)(1)="sugar"
    twoDimensionalArray(1)(0)="egg"
    twoDimensionalArray(1)(1)="syrup"
    for {x<- 0 until 2  //First declare x variable to
         y<-0 until 2}
      println(s"Donut ingredient at index ${(x,y)}=${twoDimensionalArray(x)(y)}")
  }
}
