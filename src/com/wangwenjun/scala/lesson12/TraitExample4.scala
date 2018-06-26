package com.wangwenjun.scala.lesson12

import scala.collection.mutable.ArrayBuffer

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object TraitExample4 extends App {

  val queue1: IntQueue = new ArrayBufferQueue

  queue1.put(1)
  queue1.put(2)
  println(queue1.pop())
  println(queue1.pop())

  val queue2: IntQueue = new ArrayBufferQueue with Doubling

  queue2.put(1)
  queue2.put(2)
  println(queue2.pop())
  println(queue2.pop())


  val queue3: IntQueue = new ArrayBufferQueue with Inc with Doubling

  queue3.put(1)
  queue3.put(2)
  println(queue3.pop())
  println(queue3.pop())

  class MyQueue extends ArrayBufferQueue with Inc with Doubling

  val queue4: IntQueue = new MyQueue
  queue4.put(1)
  queue4.put(2)
  println(queue4.pop())
  println(queue4.pop())

  println("==============")

  class MyQueue2 extends ArrayBufferQueue with Inc with Doubling with Filtering

  val queue5: IntQueue = new MyQueue2
  queue5.put(-1)
  queue5.put(2)
  println(queue5.pop())


}

abstract class IntQueue {
  def put(e: Int)

  def pop(): Int
}

trait Inc extends IntQueue {
  abstract override def put(e: Int): Unit = super.put(e + 1)
}

trait Filtering extends IntQueue {
  abstract override def put(e: Int): Unit = {
    if (e > 0) {
      super.put(e)
    }
  }
}

trait Doubling extends IntQueue {

  abstract override def put(e: Int): Unit = super.put(e * 2)
}

class ArrayBufferQueue extends IntQueue {

  private[this] val buf: ArrayBuffer[Int] = new ArrayBuffer[Int]()

  override def put(e: Int): Unit = {
    buf += e
  }

  override def pop(): Int = {
    if (buf.nonEmpty) {
      buf.remove(0)
    }
    else throw new RuntimeException("The queue is empty.")
  }
}