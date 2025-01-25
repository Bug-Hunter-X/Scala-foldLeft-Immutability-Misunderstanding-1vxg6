```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct use of foldLeft with immutability
  val result = list.foldLeft(List[Int]())((acc, elem) => acc :+ elem) 

  println(result) // Output: List(1, 2, 3, 4, 5)
  
  // Alternatively, using a more idiomatic approach
  val result2 = list.foldLeft(List.empty[Int])(_ :+ _)
  println(result2) // Output: List(1, 2, 3, 4, 5)
}
```