package com.wangwenjun.scala.lesson07

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object PartialFunction extends App {

  val sum: (Int, Int, Int) => Int = (x: Int, y: Int, z: Int) => x + y + z

  println(sum(1, 2, 3))

  //  val f1: (Int, Int, Int) => Int = sum _
  //  println(f1(1, 2, 3))

  val f2: (Int, Int, Int) => Int = sum2 _
  println(f2(1, 2, 3))

  val f1: () => (Int, Int, Int) => Int = sum _

  println(f1()(1, 2, 3))


  def sum2(x: Int, y: Int, z: Int): Int = {
    x + y + z
  }

  val f3: (Int, Int) => Int = sum(1, _: Int, _: Int)
  println(f3(2, 3))

  val f4: Int => Int = sum2(1, _: Int, 2)
  println(f4(10))

  /**
    * test(1,2,3)
    * test(1,2)
    *
    * function test(x,y,z=3){
    *
    * }
    *
    */
}
