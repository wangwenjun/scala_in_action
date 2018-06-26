package com.wangwenjun.scala.lesson12

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object TraitExample2 extends App {
  val studentService: StudentService = new StudentServiceImpl(
    Array(
      new Student("Alex", 30, 1, "Male"),
      new Student("Jack", 28, 3, "Male"),
      new Student("Leo", 33, 2, "Male"),
      new Student("Cindy", 36, 5, "FeMale"),
      new Student("Alice", 40, 7, "FeMale")
    )
  )

  studentService.list.foreach(println)
  println("===============================")

  val lessThan30: Student => Boolean = (student: Student) => student.getAge < 30

  studentService.list(lessThan30).foreach(println)
}

class Student(name: String, age: Int, grade: Int, gender: String) {
  def getName = name

  def getAge = age

  def getGrade = grade

  def getGender = gender

  override def toString: String = s"name:${name},age:${age},grade:${grade},gender:${gender}"
}

trait StudentService {
  def list: Array[Student]

  def listAllMale: Array[Student] = {
    list.filter(_.getGender == "Male")
  }

  def listAllFemale: Array[Student] = {
    list.filter(_.getGender == "FeMale")
  }

  def listAgeThan30: Array[Student] = {
    list.filter(_.getAge > 30)
  }

  def list(cond: Student => Boolean): Array[Student] = {
    list.filter(cond)
  }
}

class StudentServiceImpl(students: Array[Student]) extends StudentService {

  override val list = students

}
