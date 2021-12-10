package com.knoldus.oopassignment

import scala.collection.mutable.ListBuffer

class DoubleQueue extends Queue {
  override def enQueue(list: ListBuffer[Int], element: Int): Unit = {
    list.append(element * 2)
  }
}




