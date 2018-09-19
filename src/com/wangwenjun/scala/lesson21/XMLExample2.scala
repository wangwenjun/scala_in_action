package com.wangwenjun.scala.lesson21

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  * **************************************/
object XMLExample2 extends App {

  val items: Array[String] = Array("Hello", "Scala")
  val xml1 = <ul>
    <li>
      {items(0)}
    </li>
    <li>
      {items(1)}
    </li>
  </ul>

  println(xml1)

  val xml2 = <ul>{for (i <- items) yield <li>{i}</li>}</ul>

  println(xml2)

  val xml3= <a>the number is {{1,2,3,4,5}}</a>
  println(xml3)

  val title="I am the title"
  val href="wangwenjun0609.taobao.com"
  val xml4= <a href={href} title={title}>Scala and Xml</a>
  println(xml4)
  val definedHref="ertre"
  val xml5= <a href={if (definedHref!=null&&definedHref!="") href else "#"}>Scala and xml</a>
  println(xml5)
}