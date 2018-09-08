package com.wangwenjun.scala.lesson18

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  * **************************************/
object CollectionAndMethod extends App {

  val names: List[String] = List("Alex", "Peter", "Jack")
  names.map(e => e.toUpperCase).foreach(println)
  println("===========================")
  val f: String => String = x => x.toUpperCase
  val result: List[String] = names.map(f)
  println(result)

  val result2 = for (n <- names) yield {
    n.toUpperCase
  }
  println(result2)

  println("==================")
  val f2: String => Seq[String] = e => Seq[String](e.toUpperCase, e.toLowerCase)
  println(names.map(f2))
  println("=====================")
  println(names.flatMap(f2))

  val nums = List(-1, -20, 100, 1, -23)
  val pf: PartialFunction[Int, Int] = {
    case n if n > 0 => n
  }
  println(nums.collect(pf))

  val pf2: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
    override def isDefinedAt(x: Int) = x > 0

    override def apply(v: Int) = v * 10
  }

  println(nums.collect(pf2))

}