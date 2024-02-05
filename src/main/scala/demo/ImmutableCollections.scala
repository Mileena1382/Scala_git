package demo

object ImmutableCollections {
  def main(args:Array[String]):Unit={

    // List
    val list1:List[String]=List("Plain donut","Strawberry Donut","Chocolate Donut") //initialize the list
    println(s"Elements of list1=$list1")


    println("How to access elements of immutable List at specific index")
    println(s"Element at index 0 = ${list1(0)}")

    println("\nStep 3: How to append elements at the end of immutable List using :+")
    val list2: List[String] = list1 :+ "Vanilla Donut"
    println(s"Append elements at the end using :+ = $list2")

    println("\nStep 4: How to prepend elements at the front of immutable List using +:")
    val list3: List[String] = "Vanilla Donut" +: list1
    println(s"Prepend elements at the front using +: = $list3")

    println("Add two lists")
    val list4:List[Any]=list1::list2
    println(s"List = $list4")

    println("How to add two immutable Lists together using :::")
    val list5: List[String] = list1 ::: list2
    println(s"Add two lists together using ::: = $list5")

    println("\nStep 7: How to initialize an empty immutable List")
    val emptyList: List[String] = List.empty[String]
    println(s"Empty list = $emptyList")
  }

}
