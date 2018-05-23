package com.wangwenjun.scala.lesson02

object ListExample {

  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val result: List[Int] = list.updated(0, 100)
    println(list)
    println(result)

    val list1: List[Int] = List(1, 2, 3)
    val list2: List[Int] = List(4, 5, 6)
    val list3: List[Int] = list1 ::: list2

    println(list3)

    val list4: List[Int] = List()
    //    val list5: List[Int] = list4.::(1)
    val list5 = 4 :: 3 :: 2 :: 1 :: list4
    println(list5)

    var list6: List[Int] = Nil
    for (i <- 0 to 10) {
      list6 = i :: list6
    }
    println(list6)

    val list7: List[Int] = 1 :: Nil
    println(list7)

    println(list(1))
    println(list.apply(1))
  }
}
