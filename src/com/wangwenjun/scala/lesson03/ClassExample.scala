package com.wangwenjun.scala.lesson03

/**
  * public class ClassExample{
  *
  * int accumulator
  *
  * }
  */
class ClassExample {

  var accumulator: Int = _

  def increment() = {
    accumulator += 1
    accumulator
  }

  def get() = accumulator

  def printAccumulator() {
    s"println ${accumulator}"
  }
}
