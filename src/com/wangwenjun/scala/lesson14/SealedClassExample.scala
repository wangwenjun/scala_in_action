package com.wangwenjun.scala.lesson14

/** *************************************
  *
  * @author:Alex Wang <br/>
  ***************************************/
object SealedClassExample extends App {

  println(colorMatch(BLUE("blue")))


  def colorMatch(color: Color): String = {
    color match {
      case RED(_) => "RED"
      case YELLOW(name: String) => "I am " + name
    }
  }

  def enumMatch(state: State): Unit = {
    state match {
      case INIT =>
      case RUNNING =>
      case DONE =>
    }
  }
}

sealed trait State

case object INIT extends State

case object RUNNING extends State

case object DONE extends State


sealed abstract class Color

case class RED(color: String) extends Color

case class YELLOW(color: String) extends Color

case class BLUE(color: String) extends Color

case class GREEN(color: String) extends Color