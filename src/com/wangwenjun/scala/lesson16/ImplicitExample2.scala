package com.wangwenjun.scala.lesson16

import java.awt.Button
import java.awt.event.ActionEvent
import java.io.File

import com.wangwenjun.scala.lesson16.ImplicitUtil.{file2RichFile, toActionListener, toRunnable}

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  * **************************************/
object ImplicitExample2 extends App {

  new Thread(() => println("========")).start()

  val button: Button = new Button("Scala")
  button.addActionListener((e: ActionEvent) => println(e.getActionCommand))

  val file: File = new File("C:\\Users\\wangwenjun\\IdeaProjects\\scala_in_action\\src\\com\\wangwenjun\\scala\\lesson16\\ImplicitExample1.scala")
  println(file.read)
}
