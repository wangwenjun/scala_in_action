package com.wangwenjun.scala.lesson09

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object NamingParameter extends App {

  var enableAssert: Boolean = true

  def testAssert(predication: () => Boolean) = {
    if (enableAssert && !predication()) {
      throw new AssertionError
    }
  }

  testAssert(() => 5 > 3)
  testAssert(() => 0 / 2 == 0)


  def testAssert2(predication: => Boolean) = {
    if (enableAssert && !predication) {
      throw new AssertionError
    }
  }

  testAssert2(5 > 3)

  def testAssert3(condition: Boolean) = {
    if (!condition) throw new AssertionError
  }

//  testAssert3((2 / 0) == 0)

  enableAssert = false

  testAssert2((2 / 0) == 0)
}
