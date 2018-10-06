package com.wangwenjun.scala.lesson24

import java.util.concurrent.TimeUnit

import scala.actors.{Actor, Future, TIMEOUT}

object SyncActorExample extends App {

  import scala.actors.Actor._

  val a1: Actor = actor {
    receive {
      case "hello" => println("hello")
        sender ! "done"
    }
  }
  a1.start()

  a1 !? "hello" match {
    case event: String => println(s"back ${event}")
  }

  val a2: Actor = actor {
    receiveWithin(1000 * 5) {
      case "hello" => println("hello")
      case TIMEOUT => println("timeout")
    }
  }
  a2.start()

  val a3: Actor = actor {
    receive {
      case "hello" => println("=a3=hello")
        TimeUnit.SECONDS.sleep(5)
        sender ! "alex and scala"
    }
  }
  a3.start()

  private val future: Future[Any] = a3 !! "hello"
  println(future.isSet)
  println(future.apply())

}
