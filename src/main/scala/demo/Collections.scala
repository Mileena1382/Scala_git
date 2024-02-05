package demo

object Collections {
  def main(args:Array[String]):Unit={
    val games=Set("Cricket","Football","golf")

    println(games)
    println(games.head) //Returns first element
    println(games.tail) // all elements except first
    println(games.isEmpty) //returns true or false
  }


}
