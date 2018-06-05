package com.wangwenjun.scala.lesson03

import java.text.SimpleDateFormat
import java.util.Date

object DateUtils {

  def currentDate = convert("yyyy-MM-dd")

  def currentTime = convert("hh:MM:ss")

  private[this] def convert(format: String): String = {
    val date: Date = new Date
    val sdf: SimpleDateFormat = new SimpleDateFormat(format)
    sdf.format(date)
  }
}
