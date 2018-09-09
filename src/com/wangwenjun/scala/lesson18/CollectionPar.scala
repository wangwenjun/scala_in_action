package com.wangwenjun.scala.lesson18

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object CollectionPar extends App {
  val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7)
  val fun: Int => Int = x => {
    println(Thread.currentThread() + "==========")
    x * 2
  }

  list.par.view.map(fun).foreach(println)
}
