object Main extends App with printMulti {
  val a = 2
  val num2 = 3
  println(s" = ${}")
  println(printMulti)

  private def printMulti = {
    s"答えは${a * num2}"
  }
}
