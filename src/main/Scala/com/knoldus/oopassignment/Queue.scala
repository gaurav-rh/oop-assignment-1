package com.knoldus.oopassignment

import scala.collection.mutable.ListBuffer

trait Queue {
  def enQueue (list:ListBuffer[Int],element:Int): Unit
  def deQueue (list:ListBuffer[Int]):Int= {
    val poppedElement = list.head
    list.remove(0)
    poppedElement
  }
}
