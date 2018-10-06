package com.wangwenjun.scala.lesson24

import scala.actors.Channel

object ActorChannelExample1 extends App {

  private val channel: Channel[Int] = new Channel[Int]()

  channel ! 10

  new Thread(() => {
    for (i <- 0 to 9) {
      channel ! i
    }
  }).start()
  while (true) {
    channel.receive {
      case i: Int => println(i)
    }
  }

  implicit private def toRunnable(fun: () => Unit): Runnable = {
    new Runnable() {
      override def run() = fun()
    }
  }
}
