package com.wangwenjun.scala.lesson09

import java.io.File

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/

/**
  * 伪代码
  * def matcher(dir: String, suffix: String,m:Handle): Array[String] = {
  * for {
  * file <- list(dir)
  * if file.m(suffix)
  * } yield file
  * }
  *
  */
object DuplicatedSourceCode extends App {

  private[this] def list(dir: String): Array[String] = new File(dir).list()

  def listBySuffix(dir: String, suffix: String): Array[String] = {
    for {
      file <- list(dir)
      if file.endsWith(suffix)
    } yield file
  }

  def listByKeyWords(dir: String, keyWords: String): Array[String] = {
    for {
      file <- list(dir)
      if file contains keyWords
    } yield file
  }

  def listByRegex(dir: String, regex: String): Array[String] = {
    for {
      file <- list(dir)
      if file matches regex
    } yield file
  }

  listBySuffix("C:\\Users\\wangwenjun\\IdeaProjects\\scala_in_action\\src\\com\\wangwenjun\\scala\\lesson08", ".sc")
    .foreach(println)
  println("================")
  listByKeyWords("C:\\Users\\wangwenjun\\IdeaProjects\\scala_in_action\\src\\com\\wangwenjun\\scala\\lesson08", "Example")
    .foreach(println)
}
