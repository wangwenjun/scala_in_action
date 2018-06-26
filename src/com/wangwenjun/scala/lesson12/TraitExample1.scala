package com.wangwenjun.scala.lesson12

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object TraitExample1 extends App {

  trait Human {
    def weAreHuman(): Unit = {
      println("we are human")
    }
  }

  trait People {
    def weAreHuman(): Unit = {
      println("we are People")
    }
  }

  class Alex extends Human {
    override val toString: String = "Alex"
  }

  val alex1: Alex = new Alex
  println(alex1)
  alex1.weAreHuman()

  val alex2: Human = new Alex
  println(alex2)
  alex2.weAreHuman()


  class Male

  class Female

  class Tina extends Female with Human {
    override val toString: String = "Tina"
  }

  val tina1: Tina = new Tina
  println(tina1)
  tina1.weAreHuman()


  val tina2: Female = new Tina
  println(tina2)

  val tina3: Human = new Tina
  println(tina3)
  tina3.weAreHuman()

  println("==========================")

  class Jack extends Male with People with Human {
    override val toString: String = "Jack"

    override def weAreHuman(): Unit = {
      println("Jack is human")
    }
  }

  val jack: Jack = new Jack
  jack.weAreHuman()
}
