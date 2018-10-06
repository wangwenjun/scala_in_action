package com.wangwenjun.scala.lesson24

import scala.actors.{!, Actor, Channel}

object ActorChannelExample3 extends App {

  private case class Message(value: Int, channel: Channel[Int])

  import scala.actors.Actor._

  val a1: Actor = actor {
    while (true) {
      receive {
        case Message(msg, channel) => println(s"received data:${msg}")
          channel ! msg + 10
      }
    }
  }
  a1.start()

  val a2: Actor = actor {
    while (true) {
      receive {
        case !(channel, msg) => println(s"received data:${msg} from ${channel}")
      }
    }
  }

  a2.start()

  private val channel: Channel[Int] = new Channel[Int](a2)
  a1 ! Message(1, channel)
  a1 ! Message(2, channel)
  a1 ! Message(3, channel)
}