package com.wangwenjun.scala.lesson18

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object CollectionAndZip extends App {

  val prices: List[Double] = List(23.43, 53.34, 3544.1)
  val quantities: List[Int] = List(10, 4, 1)

  println(prices.zip(quantities))

  println {
    prices.zip(quantities).map(e => e._1 * e._2).sum
  }

  println {
    List(1, 2, 3, 4, 5, 6).zipAll(List(4, 5), 2, 3)
  }
  println {
    List(1, 2).zipAll(List(4, 5, 6, 7, 8, 9), 2, 3)
  }

  println {
    List(1, 2, 3, 40, 5, 6).zipWithIndex.max._2
  }
  println {
    "ScalaInAction".zipWithIndex.max
  }

}
