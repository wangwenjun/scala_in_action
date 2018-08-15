package com.wangwenjun.scala.lesson16

import java.awt.Button
import java.awt.event.{ActionEvent, ActionListener}
import java.io.File

import scala.io.Source

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.com
  ***************************************/
object ImplicitExample1 extends App {

  val file: File = new File("C:\\Users\\wangwenjun\\IdeaProjects\\scala_in_action\\src\\com\\wangwenjun\\scala\\lesson16\\ImplicitExample1.scala")
  println(file.read)

  class RichFile(file: File) {
    def read(): String = {
      Source.fromFile(file).mkString
    }
  }

  implicit def file2RichFile(file: File): RichFile = new RichFile(file)

  new Thread(() => println("========")).start()

  implicit def toRunnable(f: () => Unit): Runnable = {
    new Runnable() {
      override def run(): Unit = f()
    }
  }

  val button: Button = new Button("Scala")
  button.addActionListener((e: ActionEvent) => println(e.getActionCommand))

  implicit def toActionListener(f: ActionEvent => Unit): ActionListener = {
    new ActionListener {
      override def actionPerformed(e: ActionEvent): Unit = {
        f(e)
      }
    }
  }
}