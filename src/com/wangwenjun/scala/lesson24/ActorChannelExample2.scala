package com.wangwenjun.scala.lesson24

import scala.actors.{Actor, Channel}

object ActorChannelExample2 extends App {

  private val channel: Channel[Int] = new Channel[Int]()

  private case class Message(value: Int, channel: Channel[Int])

  import scala.actors.Actor._

  val a: Actor = actor {
    while (true) {
      receive {
        case msg: Message => println(msg.value)
          msg.channel ! msg.value + 10
      }
    }
  }
  a.start()
  a ! Message(100, channel)
  channel.receive {
    case result: Int => println(s"get the calculate result:${result}")
  }
}
