package demo

object Range {
def main(args:Array[String]):Unit={
  println("Create a numeric range from 1 to 5")
  val from1to5=1 to 5
  println(s"Range from 1 to 5 is $from1to5")

  println("Create a numeric range from 1 to 4")
  val from1until5=1 until 5
  println(s"Range excluding 5=$from1until5")

  println("Range incremented by 2")
  val from0To10By2= 0 to 10 by 2
  print(s"Range with multiples of 2=$from0To10By2")

  println("Alphabetical range")
  val AToZ='a' to 'z' //Use single quotes
  println(s"Range of alphabets from a to z=$AToZ")

  println("Alphabetical range with increment")
  val AToZBy2='a' to 'z'  by 2//Use by 2 print alternate letters
  println(s"Range of alphabets from a to z with increment=$AToZBy2")

  println("Storing ranges into collections")
  val listfrom1TO5=(1 to 5).toList
  println(s"Range to list=${listfrom1TO5}") // inside brackets and comma
  println(s"Range to list=${listfrom1TO5.mkString(" ")}") // Make to string

  val setFrom1To5=(1 to 5).toSet
  println(s"Range to set=${setFrom1To5.mkString(" ")}")

  val seqFrom1To5=(1 to 5).toSeq
  println(s"Range to sequence=${seqFrom1To5.mkString(" ")}")

  val arrayFrom1To5=(1 to 5).toArray
  println(s"Range to array=${arrayFrom1To5.mkString(" ")}")


  //While loop
  println("Use while loop")
  var numOfDonutsToBake=10
  while (numOfDonutsToBake>0) {
    println(s"Num of donuts to bake=$numOfDonutsToBake")
    numOfDonutsToBake -=1 // Decrementing by 1
  }

  // Do while loop
  println("Do while loop")
  var numOfDonutsBaked=0
  do{
    numOfDonutsBaked +=1 // Increment by 1
    println(s"Number of donuts baked=$numOfDonutsBaked")
  }while(numOfDonutsBaked<5) //If this condition is satisfied it enters do loop


}
}
