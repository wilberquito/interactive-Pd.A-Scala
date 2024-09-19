import udg.objects.Sort

object Main extends App {
  println("Hello World! I love to sort arrays hehe\n")

  val y = Array(4, 2, 3, 5, 6, 10, 1, 15, 25, 7)
  println("Ep! an unsorted array: \n" + y.mkString(", ") + "\n")

  val sorted_y = Sort.sortf(y)
  println("Now I am good... :)")
  println(sorted_y.mkString(", "))
}