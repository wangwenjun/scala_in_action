package com.wangwenjun.scala.lesson18

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object CollectionLazyView extends App {

  val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7)

  val fun: Int => Int = x => {
    println("==============" + x)
    x * 2
  }

  val result = list.view.map(fun)
  println(result)


  result.foreach(println)

  val result2 = (1 to 10).view.map(fun)
  println(result2)

  println(result2(5))

  val result3 = list.view(2, 4).map(fun)
  println(result3)
  result3.foreach(println)

  println("*" * 50)
  val result4 = (1 to 10).view.map(fun).force
  println("^" * 50)
  result4.foreach(println)
}
