package com.wangwenjun.scala.lesson24

import scala.actors.Actor

object HelloActorExample extends App {

  class HelloActor extends Actor {
    override def act(): Unit = {
      while (true) {
        receive {
          case "Hi" => println("I received the greeting Hi.")
          case other: String => println(s"Other:${other}")
        }
      }
    }
  }

  val helloActor: Actor = new HelloActor
  helloActor.start()

  helloActor ! "Hi"
  helloActor ! "Hi"
  helloActor ! "Hi"

  helloActor ! "hello"

  import scala.actors.Actor._

  val hiActor: Actor = actor {
    while (true) {
      receive {
        case "Hello" => {
          println("I received the greeting Hello.")
          helloActor ! "Scala"
        }
      }
    }
  }
  hiActor.start()

  hiActor ! "Hello"


}
