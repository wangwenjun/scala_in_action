package com.wangwenjun.scala.lesson19

import scala.annotation.{ClassfileAnnotation, StaticAnnotation}

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object CustomScalaAnnotation extends App {

  val b = new B
  //b.getClass.isAnnotationPresent(classOf[A])

  b.getClass.getAnnotations.foreach(println)
  println("**" * 10)
  val c = new C
  println(c.getClass.isAnnotationPresent(classOf[Alex]))

  println("*" * 20)
  val e = new E
  println(e)

  println("=============+===============================")

  import scala.reflect.runtime.universe._

  val mirror = runtimeMirror(b.getClass.getClassLoader)
  val clsSymbol = mirror.staticClass(b.getClass.getCanonicalName)
  clsSymbol.annotations.foreach(println)
}


@A
class B

@D
@Alex
class C

@D
class E

class A extends StaticAnnotation {
  override def toString: String = "A"
}

class D extends ClassfileAnnotation