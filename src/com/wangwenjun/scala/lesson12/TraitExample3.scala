package com.wangwenjun.scala.lesson12

import java.io.{File, FileWriter}

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object TraitExample3 extends App {

  val transaction: Transaction = new Transaction with ConsoleLogger with FileLogger
  transaction.doBusiness("Alex transfer money to Tina")
}

trait Logger {
  val x: Int = 10

  def log(content: String): Unit = {
    println("===Logger===")
  }
}

trait FileLogger extends Logger {
  override def log(content: String): Unit = {
    var fileWriter: FileWriter = null
    try {
      fileWriter = new FileWriter(new File("Log.log"))
      fileWriter write content
    } finally {
      fileWriter.flush()
      fileWriter.close()
    }
  }
}

trait ConsoleLogger extends Logger {
  override def log(content: String): Unit = {
    println(content)
  }
}

class Transaction extends Logger {
  println(x)

  def doBusiness(contents: String): Unit = {
    log(contents)
  }
}