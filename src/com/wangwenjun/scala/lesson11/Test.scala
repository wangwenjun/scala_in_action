package com.wangwenjun.scala.lesson11

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
class Test(name: String) {

  val _name = name

  override def equals(obj: scala.Any): Boolean = {
    this._name.equals(obj.asInstanceOf[Test]._name)
  }
}
