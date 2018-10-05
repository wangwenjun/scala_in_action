package com.wangwenjun.scala.lesson23

import scala.util.matching.Regex

object ExtractorExample5 extends App {

  val numberExpression: String = "(-)?(\\d+)(\\.\\d*)?"

  val number = new Regex(numberExpression)
  println(number)

  number.findFirstIn("234.2342 2434 35353.24").foreach(println)
  number.findAllIn("234.2342 2434 35353.24").foreach(println)

  val numberExpression2: String = """(-)?(\d+)(\.\d*)?"""
  numberExpression2.r.findAllIn("fsd dfd 234.2342").foreach(println)

  val number(sign, i, d) = "-34.2"
  println(sign)
  println(i)
  println(d)

  val email ="""([A-Za-z0-9_\-\.]+)\@([A-Za-z0-9_\-\.]+)\.([A-Za-z]{2,4})"""
  val Mail = email.r

  val Mail(user, comp, net) = "wangwenjun0609@alex.org"
  println(user)
  println(comp)
  println(net)
}
