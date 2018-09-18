package com.wangwenjun.scala.lesson21

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object XMLExample1 extends App {

  /**
    * DOM
    * SAX
    */
  private val xml = <a>hello
    <b/>
    scala</a>
  println(xml)
  println(xml.getClass)

  private val (x, y) = (1, 2)
  println(x < y)
  //println(x <y)

  private val html = <html>
    <title>Scala Programming</title>
    <script language="javascript">
      console.log("===============")
    </script>
    <body>
      <!--i am the comment-->
      <h1>Scala process XML document</h1>
      <br/>
    </body>
  </html>
  println(html)
  println("=======================")
  println(html.label)
  for (node <- html.child) {
    println(node)
    println("********************************************")
  }

  val attr = <a title="I am the title">Hello Scala</a>
  println(attr.attributes("title").text)
  //println(attr.attributes("title1").text)

  val attrValue = attr.attributes.get("sdfsdfsd") match {
    case Some(node) => node.text
    case None => "Empty"
  }
  println(attrValue)
  println("************************************")
  val attrs = <a title="I am the title" href="fsfs">Hello Scala</a>

  for (a <- attrs.attributes) {
    println(a.key + "==========" + a.value)
  }
  attrs.attributes.asAttrMap.foreach(e => println(s"${e._1}=======${e._2}"))
}
