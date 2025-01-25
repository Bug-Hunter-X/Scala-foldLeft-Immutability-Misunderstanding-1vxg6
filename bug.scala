```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Incorrect use of foldLeft, attempting to modify the accumulator
  val result = list.foldLeft(List[Int]())((acc, elem) => acc :+ elem)

  println(result) // Output: List(1, 2, 3, 4, 5)
}
```