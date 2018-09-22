package com.wangwenjun.scala.lesson21

import java.io.File

import com.wangwenjun.scala.lesson21.XMLExample5.XMLEntity

import scala.xml.dtd.{DocType, PublicID}
import scala.xml.{Elem, XML}

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object XMLExample6 extends App {
  val node = <entity>
    <name>Chris</name>
    <age>30</age>
    <address>CHINA</address>
    <title>Engineer</title>
    <gender>false</gender>
    <salary currency="USD">22315.0</salary>
  </entity>

  XML.save("node.xml", node, xmlDecl = true, enc = "UTF-8")

  def fun(x: Int, y: Int = 10, z: Int = 20): Int = {
    x + y + z
  }

  def foo(x: Int, y: Int): Int = {
    x + y * 2
  }

  println(fun(100, z = 50))
  println(foo(y = 1, x = 2))

  val loadedNode: Elem = XML.loadFile(new File("node.xml"))
  println((loadedNode \ "name").text)

  val entity = new XMLEntity(loadedNode)
  println(entity.age)
  println(entity.toXML())

  val html = <html>
    <head>
      <title>Scala And XML</title>
    </head>
    <body>
      <h1>Alex sharing Scala courses.</h1>
    </body>
  </html>

  XML.save("html.html", html, enc = "UTF-8", doctype =
    DocType("html", PublicID("-//W3C//DTD XHTML 1.0 Transitional//EN",
      "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd"), Nil)
  )

  val namespaceBEAN = <bean xmlns:aop="http://www.w3.org/1999/xhtml">
    <aop:alex>
      I am Alex, and i come from the XML namespace.
    </aop:alex>
  </bean>

  println((namespaceBEAN \ "alex").text)
}
