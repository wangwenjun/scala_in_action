package com.wangwenjun.scala.lesson15

import java.util.Comparator

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.com
  * **************************************/
object GenericExample2 extends App {


  /**
    * View Bound
    *
    * @param first
    * @param second
    * @param ev$1
    * @tparam T
    */
  class Pair[T <% Comparable[T]](val first: T, val second: T) {

    def firstLessThanSecond: Boolean = {
      if (first.compareTo(second) < 0) true else false
    }
  }

  class Pair2[T](val first: T, val second: T)(implicit t: T => Comparable[T]) {
    def firstLessThanSecond: Boolean = {
      if (first.compareTo(second) < 0) true else false
    }
  }

  class Pair3[T](val first: T, val second: T)(implicit t: T => Ordered[T]) {
    def firstLessThanSecond: Boolean = first <= second
  }

  class Pair4[T: Comparator](val first: T, val second: T) {
    def firstLessThanSecond: Boolean = {
      val c: Comparator[T] = implicitly[Comparator[T]]
      if (c.compare(first, second) < 0) true else false
    }
  }

  val p1: Pair[Int] = new Pair[Int](1, 2)
  println(p1.firstLessThanSecond)

  val p2: Pair2[Int] = new Pair2[Int](1, 2)
  println(p2.firstLessThanSecond)

  val p3: Pair3[Int] = new Pair3[Int](1, 2)
  println(p3.firstLessThanSecond)


  implicit val c: Comparator[Int] = new Comparator[Int] {
    override def compare(o1: Int, o2: Int): Int = {
      o1 - o2
    }
  }

  val p4: Pair4[Int] = new Pair4[Int](10, 20)
  println(p4.firstLessThanSecond)
}




