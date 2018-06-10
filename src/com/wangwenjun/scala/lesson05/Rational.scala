package com.wangwenjun.scala.lesson05

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
/**
  * 1/2
  * 3/4
  * <code>
  * public class Rational{
  *
  * private int n;
  * private int d;
  * public Rational(int n,int d){
  *       this.n = n;
  *       this.d = d;
  *       System.out.println(sfsdf);
  * }
  * }
  * </code>
  */
class Rational(private val n: Int, private val d: Int) {

  require(d != 0)

  private[this] val g: Int = gcd(n, d)

  val $n: Int = n / g
  val $d: Int = d / g

  def this() {
    this(1, 1)
  }

  def this(n: Int) {
    this(n, 1)
  }

  def add(that: Rational): Rational = {
    new Rational($n * that.$d + that.$n * $d, $d * that.$d)
  }

  def add(i: Int): Rational = {
    this.add(new Rational(i))
  }

  def +(that: Rational): Rational = {
    this.add(that)
  }

  def +(i: Int): Rational = {
    this.+(new Rational(i))
  }

  def subtract(that: Rational): Rational = {
    new Rational($n * that.$d - that.$n * $d, $d * that.$d)
  }

  def subtract(i: Int): Rational = {
    this.subtract(new Rational(i))
  }

  def -(that: Rational): Rational = {
    this.subtract(that)
  }

  def -(i: Int): Rational = {
    this.subtract(i)
  }

  def multiply(that: Rational): Rational = {
    new Rational(this.$n * that.$n, this.$d * that.$d)
  }

  def multiply(i: Int): Rational = {
    this.multiply(new Rational(i))
  }

  def *(that: Rational): Rational = {
    this.multiply(that)
  }

  def *(i: Int): Rational = {
    this.multiply(i)
  }

  def divide(that: Rational): Rational = {
    new Rational(this.$n * that.$d, this.$d * that.$n)
  }

  def divide(i: Int): Rational = {
    this.divide(new Rational(i))
  }

  def /(that: Rational): Rational = {
    this.divide(that)
  }

  def /(i: Int): Rational = {
    this.divide(i)
  }

  override def toString(): String = {
    s"${$n}/${$d}"
  }

  def lessThan(that: Rational): Boolean = {
    $n * that.$d < that.$n * $d
  }

  def max(that: Rational): Rational = {
    if (this.lessThan(that)) that else this
  }

  private[this] def gcd(x: Int, y: Int): Int = {
    if (y == 0) x
    else gcd(y, x % y)
  }
}