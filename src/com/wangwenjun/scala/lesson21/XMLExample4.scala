package com.wangwenjun.scala.lesson21

import scala.xml.{Node, Text}

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object XMLExample4 extends App {

  private[this] val xml= <conf>
  <name>test-application</name>
    <database>
      <username>alex</username>
      <password>scala</password>
    </database>
  </conf>

  println(xml)

  for(node<-xml.child){
    node match{
      case <name>{Text(item)}</name>=>println("N:"+item)
      case <database>{_*}</database>=>parseDBConf(node)
      case _=>
    }
  }

  private[this] def parseDBConf(node:Node):Unit={
    for(child<-node.child){
      child match{
        case <username>{username}</username>=>println(username.text)
        case <password>{_*}</password>=>println(child.text)
        case _=>
      }
    }
  }
}
