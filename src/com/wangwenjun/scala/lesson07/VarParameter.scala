package com.wangwenjun.scala.lesson07

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object VarParameter extends App {

  test("Hello", "Scala", "Alex", "Java")

  def test(args: String*): Unit = {
    for (s <- args) {
      println(s)
    }
  }

  val arr: Array[String] = Array("Hello", "Function", "Scala", "Java")
  test(arr: _*)

  println("=========================")
  val list: List[String] = List("sfsd", "sdfsdfsd", "sdfsdfs")
  test(list: _*)
  println("=========================")
  //  val set: Set[String] = Set("sdfs", "234", "dfgd")
  //  test(set: _*)

  //  val tuple: (String, String, String) = Tuple3("dfsd", "fdgdg", "dgdgd")
  //  println(tuple: _*)

  val map: Map[String, String] = Map[String, String](
    "Hello" -> "World",
    "Scala" -> "Java"
  )

  //  test2(map: _*)

  def test2(args: (String, String)*): Unit = {
    args.foreach(t => {
      println(s"${t._1}=${t._2}")
    })
  }
}
