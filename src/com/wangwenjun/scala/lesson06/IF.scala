package com.wangwenjun.scala.lesson06

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object IF extends App {

  val score: Int = 80
  var grade: String = _
  if (score < 60) {
    grade = "E"
  } else if (score <= 70) {
    grade = "D"
  } else if (score <= 80) {
    grade = "C"
  } else if (score <= 90) {
    grade = "B"
  } else {
    grade = "A"
  }
  println(grade)

  println("======================")

  val result = if (score < 60) {
    "E"
  } else if (score <= 70) {
    "D"
  } else if (score <= 80) {
    "C"
  } else if (score <= 90) {
    "B"
  } else {
    "A"
  }
  println(result)
  val b: Boolean = true
  val i: Int = if (b) 1 else 0
}
