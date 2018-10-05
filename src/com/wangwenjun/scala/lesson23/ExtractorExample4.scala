package com.wangwenjun.scala.lesson23

import com.wangwenjun.scala.lesson23.ExtractorExample2.Email

object ExtractorExample4 extends App {

  object Domain {

    def apply(str: String*): String = {
      str.reverse.mkString(".")
    }

    def unapplySeq(whole: String): Option[Seq[String]] = {
      Some(whole.split("\\.").reverse)
    }
  }

  val webSite: String = "kafka.apache.org"
  webSite match {
    case Domain(_, "apache", _*) => println(s"${webSite} come from apache project")
    case _ => println(s"others:${webSite}")
  }

  val email: String = "alex.wang@wangwenjun.com"
  //  val email: String = "alex.wang@wangwenjun.org"
  email match {
    case Email(user, domain@Domain("com", _*)) => println(s"${user}==com=${domain}")
    case Email(user, domain@Domain("org", _*)) => println(s"${user}==org=${domain}")
    case Email(user, domain) => println(s"${user}===${domain}")
    case _ => println("========")
  }

  val arr: Array[Int] = Array[Int](1)

  arr match {
    case Array(0) => println("I have one element and the element value is zero")
    case Array(1) => println("I have one element and the element value is 1")
    case _ =>

  }
}
