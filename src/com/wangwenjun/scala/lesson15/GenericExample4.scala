package com.wangwenjun.scala.lesson15

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.com
  * **************************************/
object GenericExample4 extends App {

  trait T

  class A extends T

  class B extends A

  class C extends B

  class D extends C

  class E

  class Pair[T1 <: T, T2 >: C](val first: T1, val second: T2)

  println(new Pair[A, C](new A, new C))

  def test[T >: C](t: T): Unit = {
    println(t)
  }

  println("====================================")
  test(new String("============"))
  println("====================================")


  /**
    *
    * C:<X<:T
    *
    * @tparam X
    */
  class Person[X >: D <: T](val x: X)

  println(new Person[C](new C))

  class Alex[T <: Comparable[T] with Serializable with Cloneable](val t: T)

  class AlexT extends Comparable[AlexT] with Serializable with Cloneable {
    override def compareTo(o: AlexT): Int = 0
  }

  println(new Alex[AlexT](new AlexT))


  class Pair2[T <% Comparable[T] <% Serializable](val x: T, y: T)

}