package com.wangwenjun.scala.lesson17

import java.io.{File, FileWriter}
import java.util.Date

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object SeniorTypeExample9 extends App {

  trait Logger {
    def log(msg: String): Unit
  }

  class Auth {
    self: Logger =>
    def action(msg: String): Unit = {
      self.log(msg)
    }
  }

  trait ConsoleLogger extends Logger {
    override def log(msg: String): Unit = println(s"${new Date} - ${msg} ")
  }

  trait FileLogger extends Logger {
    override def log(msg: String): Unit = {
      var fileWriter: FileWriter = null
      try {
        fileWriter = new FileWriter(new File("SeniorTypeExample9.log"), true)
        fileWriter.write(s"${new Date} - ${msg} \n")
      } finally {
        fileWriter.flush()
        fileWriter.close()
      }
    }
  }

  val authConsole = new Auth with ConsoleLogger
  authConsole action "Alex"

  val authFile = new Auth with FileLogger
  authFile action "WangWenJun Love Scala."


  trait T {
    def t(x: String): Unit
  }

  class X(implicit t: T) {

    def x(str: String): Unit = {
      t.t(str)
    }
  }

  implicit private val t: T = new T {
    override def t(x: String): Unit = println(s"=======${x}========")
  }

  new X x "Hello World"
}
