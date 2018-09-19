package com.wangwenjun.scala.lesson21

import scala.xml.Node

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  * **************************************/
object XMLExample5 extends App {

  abstract class Entity {
    val name: String
    val age: Int
    val address: String
    val title: String
    val gender: Boolean
    val salary: Double
    val currency: String

    def toXML():Node={
      <entity>
        <name>{name}</name>
        <age>{age}</age>
        <address>{address}</address>
        <title>{title}</title>
        <gender>{gender}</gender>
        <salary currency={currency}>{salary}</salary>
      </entity>
    }
  }

  val entity:Entity=new Entity {override val address: String = "CHINA"
    override val gender: Boolean = true
    override val salary: Double = 12315
    override val title: String = "Engineer"
    override val name: String = "Alex"
    override val currency: String = "USD"
    override val age: Int = 34
  }

  class XMLEntity(node:Node) extends Entity{
    override val name: String = (node \ "name").text
    override val age: Int = (node \ "age").text.toInt
    override val address: String = (node \ "address").text
    override val title: String = (node \ "title").text
    override val gender: Boolean = (node \ "gender").text.toBoolean
    override val salary: Double = (node \ "salary").text.toDouble
    override val currency: String = (node \ "salary" \"@currency").text
  }

  println(entity.toXML())
  val node= <entity>
    <name>Chris</name>
    <age>30</age>
    <address>CHINA</address>
    <title>Engineer</title>
    <gender>false</gender>
    <salary currency="USD">22315.0</salary>
  </entity>
  val xmlEntity:Entity = new XMLEntity(node)
  println("*"*30)
  println(xmlEntity.toXML())
}
