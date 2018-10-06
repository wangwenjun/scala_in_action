package com.wangwenjun.scala.lesson24

import java.util.concurrent.atomic.AtomicInteger

import scala.actors.Actor

object SendReceiveActorExample extends App {

  case class Request(no: Int, content: String)

  case class Response(no: Int, requestId: Int, content: String)

  case class Communication(content: String, actorRef: Actor)

  class MyActor extends Actor {
    override def act(): Unit = {
      while (true) {
        receive {
          case Request(no, content) => println(s"${no}======${content} ==${Thread.currentThread()}")
        }
      }
    }
  }

  private val actor = new MyActor
  actor.start()

  //the message will be handle by sequence way inner the actor
  actor ! Request(1, "Hello ")

  for (i <- 1 to 10) {
    actor ! Request(i, s"Hello ${i}")
  }

  //due to the message send is by async way, so the actor message sequence not guarantee
  val seq: AtomicInteger = new AtomicInteger(0)

  for (i <- 1 to 2) {
    new Thread(new Runnable() {
      override def run() = {
        while (seq.get() < 100) {
          actor ! Request(seq.getAndIncrement(), s"Request:${seq.get()}")
        }
      }
    }, s"T-${i}").start()
  }

  class RequestActor(otherActor: Actor) extends Actor {
    override def act(): Unit = {
      while (true) {
        receive {
          case Request(no, content) => println(s"${no}======${content} ==${Thread.currentThread()}")
            otherActor ! Response(no, 1, content + " response")
        }
      }
    }
  }

  class ResponseActor extends Actor {
    override def act(): Unit = {
      while (true) {
        receive {
          case Response(no, requestId, content) => println(s"${no}===${content}==${requestId}")
        }
      }
    }
  }

  val responseActor: Actor = new ResponseActor()

  val requestActor: Actor = new RequestActor(responseActor)

  responseActor.start()
  requestActor.start()

  requestActor ! Request(1, "communication.")

  class CommActor extends Actor {
    override def act(): Unit = {
      while (true) {
        receive {
          case Communication(msg, actorRef) => println(s"${msg}")
            actorRef ! "i received."
          case msg: String => println(msg)
        }
      }
    }
  }

  class CommActor2(actor: CommActor) extends Actor {
    override def act(): Unit = {
      while (true) {
        receive {
          case msg: String => println(msg)
          case i: Int =>
            println(s"CommActor2===${i}")
            actor ! Communication("test", this)
        }
      }
    }
  }

  val commActor1: CommActor = new CommActor
  val commActor2: CommActor2 = new CommActor2(commActor1)

  commActor1.start()
  commActor2.start()

  commActor2 ! 10
}
