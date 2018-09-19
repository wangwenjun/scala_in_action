package com.wangwenjun.scala.lesson21

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object XMLExample3 extends App {

  val xml = <a>
    <b>
      text
      <c>ctext</c>
    </b>
  </a>

  val c = xml \\ "c"
  println(c)

  val xml2 = <conf>
    <name>scala</name>
    <props>
      <prop key="k1">v1</prop>
      <prop key="k2">v2</prop>
      <prop key="k3">v3</prop>
      <prop key="k4">v4</prop>
    </props>
  </conf>


  for (node <- xml2 \\ "prop") {
    println(node)
    //    println(node.attributes("key"))
    //    println(node.text)
    println((node \ "@key").text)
    println(node.text)
  }

  println("=====+===============")

  for (a <- xml2 \\ "@key") {
    println(a.text)
  }
}
