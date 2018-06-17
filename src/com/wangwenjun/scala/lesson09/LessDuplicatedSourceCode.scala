package com.wangwenjun.scala.lesson09

import java.io.File


/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object LessDuplicatedSourceCode extends App {

  private[this] def list(dir: String): Array[String] = new File(dir).list()

  private[this] def fileMatch(dir: String, exp: String, matcher: (String, String) => Boolean): Array[String] = {
    for {
      file <- list(dir)
      if matcher(file, exp)
    } yield file
  }

  def findBySuffix(dir: String, exp: String): Array[String] = {
    //    fileMatch(dir, exp, (file, exp) => file.endsWith(exp))
    fileMatch(dir, exp, _.endsWith(_))
  }

  def findByKeyWords(dir: String, exp: String): Array[String] = {
    //    fileMatch(dir, exp, (file, exp) => file.contains(exp))
    fileMatch(dir, exp, _.contains(_))
  }

  def findByRegex(dir: String, exp: String): Array[String] = {
    //    fileMatch(dir, exp, (file, exp) => file.matches(exp))
    fileMatch(dir, exp, _.matches(_))
  }

  findBySuffix("C:\\Users\\wangwenjun\\IdeaProjects\\scala_in_action\\src\\com\\wangwenjun\\scala\\lesson08", ".sc")
    .foreach(println)

}
