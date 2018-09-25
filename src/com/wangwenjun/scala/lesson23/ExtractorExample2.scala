package com.wangwenjun.scala.lesson23


//val email:Email="alex.wang@scala.com"
object ExtractorExample2 extends App {

  class Email(user: String, domain: String) {
    override def toString: String = s"${user}@${domain}"
  }

  object Email {
    def apply(user: String, domain: String): Email = new Email(user, domain)

    def unapply(arg: String): Option[(String, String)] = {
      val i: Int = arg.indexOf("@")
      if (i < 0) None
      else Some((arg.substring(0, i), arg.substring(i + 1)))
    }
  }

  val mail: Email = Email("alex.wang", "scala.com")
  println(mail)

  val Email(name: String, domain: String) = "alex.wang@scala.com"
  println(name)
  println(domain)

  "alex.wang@scala.com" match {
    case Email(u: String, d: String) => println(s"${u}===${d}")
    case _ => println("invalid email address")
  }
}