package com.wangwenjun.scala.lesson03

class Companion {

  private var userName: String = _

  def simplePrint(): Unit = {
    println(s"${Companion.SINGAL} ${userName} ${Companion.SINGAL}")
  }
}

object Companion {
  private val SINGAL: String = "*"

  def apply(userName: String): Companion = {
    val companion: Companion = new Companion
    companion.userName = userName
    companion
  }
}