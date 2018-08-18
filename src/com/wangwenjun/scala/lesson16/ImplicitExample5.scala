package com.wangwenjun.scala.lesson16

import java.nio.file.{Files, Path, Paths}

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object ImplicitExample5 extends App {

  def firstLessThanSecond[T <% Ordered[T]](first: T, second: T): Boolean = {
    first < second
  }

  println(firstLessThanSecond(1, 2))

  def firstLessThanSecond2[T](first: T, second: T)(implicit ordered: T => Ordered[T]): Boolean = {
    first < second
  }

  println(firstLessThanSecond2(1, 2))

  case class Age(age: Int)

  //
  println(firstLessThanSecond2(Age(30), Age(33)))

  class RichAge(val age: Age) extends Ordered[Age] {
    override def compare(that: Age): Int = {
      if (this.age.age < that.age) -1 else if (this.age.age == that.age) 0 else 1
    }
  }

  implicit def ageToRichAge(age: Age): RichAge = new RichAge(age)

}
