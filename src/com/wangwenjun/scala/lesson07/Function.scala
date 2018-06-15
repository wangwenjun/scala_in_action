package com.wangwenjun.scala.lesson07

import scala.io.{BufferedSource, Source}

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object Function extends App {


  def processFile(fileName: String): Unit = {
    val source: BufferedSource = Source.fromFile(fileName)
    for (line <- source.getLines()) {
      processLine(fileName, line)
    }
  }

  private def processLine(fileName: String, line: String) {
    println(s"${fileName}:${line}")
  }

  processFile("C:\\Users\\wangwenjun\\IdeaProjects\\scala_in_action\\src\\com\\wangwenjun\\scala\\lesson07\\Function.scala")

}
