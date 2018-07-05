package com.wangwenjun.scala.lesson14

/** *************************************
  *
  * @author:Alex Wang <br/>
  * **************************************/
object OptionExample extends App {

  val map: Map[String, String] = Map[String, String](
    "Alex" -> "CN",
    ("Alice", "US")
  )

  val op: Option[String] = map.get("Jack")

  println(optionMatch(op))

  def optionMatch(op: Option[String]): String = {
    op match {
      case Some(v) => v
      case None => "Not Found"
    }
  }
}
