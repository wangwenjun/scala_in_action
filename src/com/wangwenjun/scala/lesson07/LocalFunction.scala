package com.wangwenjun.scala.lesson07

import scala.io.{BufferedSource, Source}

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object LocalFunction extends App {

  def processFile(fileName: String): Unit = {
    val source: BufferedSource = Source.fromFile(fileName)
    for (line <- source.getLines()) {
      processLine(line)
      //1-10
    }

    def processLine(line: String): Unit = {
      println(s"${fileName}:${line}")

      def x(): Unit = {

      }

      x()
    }

    //1-20
  }

  processFile("C:\\Users\\wangwenjun\\IdeaProjects\\scala_in_action\\src\\com\\wangwenjun\\scala\\lesson07\\LocalFunction.scala")

  /**
    *
    * int x(int* p){
    * //
    * y(p)
    * ..
    * }
    *
    *
    * inline int* y(int* p){
    *
    * }
    */
}
