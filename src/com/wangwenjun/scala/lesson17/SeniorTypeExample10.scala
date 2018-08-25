package com.wangwenjun.scala.lesson17

import java.io.{File, FileReader}

import scala.io.Source

object SeniorTypeExample10 extends App {

  abstract class Reader {
    type result

    def read(path: String): result
  }

  val defaultResult = new Reader {
    override def read(path: String): result = "default mock"

    override type result = String
  }
  println(defaultResult.read("alex"))

  class StringReader extends Reader {
    type result = String

    override def read(path: String): String = Source fromFile new File(path) mkString
  }

  println(s"${new StringReader read "C:\\unintall.log"}")

  class LocalFileReader extends Reader {
    type result = FileReader

    override def read(path: String): FileReader = new FileReader(new File(path))
  }


  trait TReader[T] {
    def read(path: String): T
  }

  class TStringReader extends TReader[String] {
    override def read(path: String): String = Source fromFile new File(path) mkString
  }

  class TFileReader extends TReader[FileReader] {
    override def read(path: String): FileReader = new FileReader(new File(path))
  }

  trait T {
    type IN <: Serializable
    type OUT <: AutoCloseable

    def act(in: IN): OUT
  }
}