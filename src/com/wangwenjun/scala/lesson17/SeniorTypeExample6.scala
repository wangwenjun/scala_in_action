package com.wangwenjun.scala.lesson17

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object SeniorTypeExample6 extends App {
  //
  //  def double(seq: Seq[Int]): Seq[Int] = seq map (_ * 2)
  //
  //  def double(seq: Seq[String]): Seq[Int] = seq map (_.toInt * 2)

  def double(seq: Seq[_]): Seq[Int] = seq match {
    case Nil => Nil
    case head +: tail => (toInt(head) * 2) +: double(tail)
  }

  private[this] def toInt(x: Any): Int = x match {
    case i: Int => i
    case s: String => s.toInt
    case _ => throw new RuntimeException(s"unexpected element type for $x")
  }

  println(double(Seq[Int](1, 2, 3, 4, 5)))
  println(double(Seq[String]("1", "2", "3", "4", "5")))

}
