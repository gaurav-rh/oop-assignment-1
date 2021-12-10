package com.knoldus.oopassignment

import scala.collection.mutable.ListBuffer

object QueueTester {
  def main(args:Array[String]): Unit ={
    val list1 = ListBuffer(1, 2, 3, 4, 5)
    val list2 = ListBuffer[Int]()
    val doubleQueueObject = new DoubleQueue()
    while(list1.nonEmpty){
      val poppedElement = doubleQueueObject.deQueue(list1)
      printf("popped element is "+poppedElement)
      printf("\n")
      doubleQueueObject.enQueue(list2, poppedElement)
    }
    printf(list2.toString())
    val list3 = ListBuffer[Int]()
    val squareQueueObject = new SquareQueue()
    while(list2.nonEmpty)
    {
      val poppedElement = doubleQueueObject.deQueue(list2)
      printf("\n")
      printf("popped element is "+poppedElement)
      printf("\n")
      squareQueueObject.enQueue(list3, poppedElement)

    }
    printf(list3.toString())
  }
}
