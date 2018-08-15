package com.wangwenjun.scala.lesson16

import java.awt.event.{ActionEvent, ActionListener}
import java.io.File

import scala.io.Source

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object ImplicitUtil {

  class RichFile(file: File) {
    def read(): String = {
      Source.fromFile(file).mkString
    }
  }

  implicit def file2RichFile(file: File): RichFile = new RichFile(file)

  implicit def toRunnable(f: () => Unit): Runnable = {
    new Runnable() {
      override def run(): Unit = f()
    }
  }

  implicit def toActionListener(f: ActionEvent => Unit): ActionListener = {
    new ActionListener {
      override def actionPerformed(e: ActionEvent): Unit = {
        f(e)
      }
    }
  }
}
