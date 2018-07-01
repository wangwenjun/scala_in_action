package com.wangwenjun.scala.lesson14

/** *************************************
  *
  * @author:Alex Wang <br/>
  ***************************************/
object PatternMatchExample2 extends App {

  val seq: Seq[Int] = Seq[Int](1, 2, 3, 4, 5, 6)
  println(seq.head)
  println(seq.tail)

  /**
    * <pre>
    * 1 List(2,3,4,5,6)
    * 2  List(3,4,5,6)
    * 3 List(4,5,6)
    * 4 List(5,6)
    * 5 List(6)
    * 6 Nil
    * </pre>
    */

  def seqToString[T](seq: Seq[T]): String = {
    if (seq == Nil) {
      "Nil"
    } else {
      s"${seq.head}+:${seqToString(seq.tail)}"
    }
  }

  println(seqToString(seq))

  val h +: t = seq
  println(h)
  println(t)
  println("====+======================")
  val nonEmptyIntSeq: Seq[Int] = Seq(1, 2, 3, 4)
  val emptyIntSeq: Seq[Int] = Seq.empty[Int]
  val nonEmptyIntList: Seq[Int] = List(4, 5, 6, 7, 8)
  val emptyIntList: Seq[Int] = List.empty[Int]
  val nonEmptyMap: Map[String, Int] = Map[String, Int]("Alex" -> 33, "Alice" -> 31)
  val emptyMap: Map[String, Int] = Map.empty[String, Int]


  def seqToString2[T](seq: Seq[T]): String = {
    seq match {
      case h +: t => s"${h} +: " + seqToString2(t)
      case Nil => " Nil"
    }
  }

  println(seqToString2(nonEmptyIntSeq))
  println("====================================")

  for (s <- Seq(nonEmptyIntSeq, emptyIntSeq, nonEmptyIntList, emptyIntList, nonEmptyMap.toSeq, emptyMap.toSeq)) {
    println(seqToString2(s))
  }
}
