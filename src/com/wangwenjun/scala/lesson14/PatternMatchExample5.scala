package com.wangwenjun.scala.lesson14

/** *************************************
  *
  * @author:Alex Wang <br/>
  ***************************************/
//for case classes
object PatternMatchExample5 extends App {

  trait Amount

  case class Dollar(value: Double) extends Amount

  case class Currency(value: Double, unit: String) extends Amount

  case object Nothing extends Amount

  class MyCurrency(val value: Double) extends Amount

  val dollar: Dollar = Dollar(10)

  val myCurrency = new MyCurrency(30)

  println(dollar.value)

  println(matchTest(dollar))

  println(matchTest(myCurrency))

  val d2: Dollar = dollar.copy(100)
  println(dollar == d2)
  println(dollar.value)
  println(d2.value)
  println(d2.hashCode())
  println(dollar.hashCode())

  def matchTest(amount: Amount): String = {
    amount match {
      case Dollar(10) => "$10"
      case Dollar(v) => s"${v}"
      case Currency(_, u) => s"${u}"
      case Nothing => "nothing"
      case c: MyCurrency => s"My Currency ${c.value}"
      case _ => "unknown"
    }
  }
}
