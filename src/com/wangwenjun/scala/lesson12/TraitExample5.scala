package com.wangwenjun.scala.lesson12

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object TraitExample5 extends App {

  class Animal {
    println("====Animal===")

    def test(): Unit = {
      println("====Animal TEST===")
    }
  }

  trait Furry extends Animal {
    println("====Furry===")

    override def test(): Unit = {
      println("====Furry TEST===")
    }
  }

  trait HasLegs extends Animal {
    println("====HasLegs===")

    override def test(): Unit = {
      println("====HasLegs TEST===")
    }
  }

  trait FourLegged extends HasLegs {
    println("====FourLegged===")

    override def test(): Unit = {
      println("====FourLegged TEST===")
    }
  }

  class Cat extends Animal with FourLegged with Furry {
    println("====Cat===")

    override def test(): Unit = {
      super.test()
    }
  }

  val cat: Cat = new Cat
  cat.test()
}

/**
  * Animal-->AnyRef-->Any
  *
  * Furry---Animal-->AnyRef-->Any
  *
  * FourLegged--->HasLegs--->Animal-->AnyRef-->Any
  *
  * Cat--->Animal-->AnyRef-->Any
  * --->Furry---Animal-->AnyRef-->Any
  * --->FourLegged--->HasLegs--->Animal-->AnyRef-->Any
  */
