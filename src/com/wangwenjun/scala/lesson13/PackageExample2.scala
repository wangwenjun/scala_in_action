package com.wangwenjun.scala.lesson13

import com.wangwenjun.scala.lesson13.b.P1

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object PackageExample2 extends App {
  new P1().fun()


}

package a {

  class Outer {

    private val o: String = "Outer"

    class Inner {
      private def foo(): Unit = {
        println(o)
      }
    }

    def fun(): Unit = {
      //can't access the private function of Inner class.
      //new Inner().foo()
    }
  }

}

package b {

  class P {
    protected def foo(): Unit = {
      println("====P===foo")
    }
  }

  class P1 extends P {
    def fun(): Unit = {
      foo()
    }
  }

  class X {

    def fun(): Unit = {
      //can't access the protected function of P due to X is not the child Class P
      //even under same scala package
      //new P().foo()
    }
  }

}

package c {

  protected[c] class C {

  }

  class X {
    def foo(): Unit = {
      new C()
    }
  }

  class Y {
    private[c] val x: Int = 10
  }

  class Z {
    val y: Y = new Y
    println(y.x)
  }

}
