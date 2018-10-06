package com.wangwenjun.scala.lesson24

import scala.actors.Actor

object ThreadShareActorExample extends App {

  //
  //  class MyActor extends Actor {
  //    override def act(): Unit = {
  //      while (true) {
  //        receive {
  //          case i: Int => println(s"${i}====${Thread.currentThread()}")
  //        }
  //      }
  //    }
  //  }

  //  class MyActor extends Actor {
  //    override def act(): Unit = {
  //      loop {
  //        react {
  //          case i: Int => println(s"${i}====${Thread.currentThread()}")
  //        }
  //      }
  //    }
  //  }

  //  class MyActor extends Actor {
  //    override def act(): Unit = {
  //      while (true) {
  //        react {
  //          case i: Int => println(s"${i}====${Thread.currentThread()}")
  //            act()
  //        }
  //      }
  //    }
  //  }

  class MyActor extends Actor {
    override def act(): Unit = {
      loop {
        receive {
          case i: Int => println(s"${i}====${Thread.currentThread()}")
        }
      }
    }
  }

  val myActor: Actor = new MyActor()
  myActor.start()
  for (i <- 1 to 100) {
    myActor ! i
  }
}