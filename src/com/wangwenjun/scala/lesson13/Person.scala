package com.wangwenjun.scala.lesson13

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
class Person {

  println("========person======")
}

/**
  * Note:
  * open the below comments will occur compile error.
  */
/*package sub {

  class Alex

}*/

package test.test1.test2 {

  class C

}

package test {

  class A {
    println("=++==A===")
  }

  package test1.test2 {

    class B {
      val a: A = new A
      println("===B===")
    }

  }

}