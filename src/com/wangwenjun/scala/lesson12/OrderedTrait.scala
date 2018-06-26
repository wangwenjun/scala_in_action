package com.wangwenjun.scala.lesson12

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object OrderedTrait {

  def main(args: Array[String]): Unit = {
    val p1: Person = new Person("Alex", 33)
    val p2: Person = new Person("Tina", 32)

    /*    if (p1.sAge.>(p2.sAge)) {
          println("Alex older than Tina")
        } else if (p1.sAge == p2.sAge) {
          println("Alex equals Tina")
        } else {
          println("Alex young than Tina")
        }*/

    println(p1 > p2)
  }
}

class Person(name: String, age: Int) extends Ordered[Person] {

  val sName: String = name

  val sAge: Int = age

  override def compare(that: Person): Int = {
    if (this.sAge.>(that.sAge)) {
      1
    } else if (this.sAge == that.sAge) {
      0
    } else {
      -1
    }
  }
}