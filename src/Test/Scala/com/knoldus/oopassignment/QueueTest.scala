package com.knoldus.oopassignment

import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.mutable.ListBuffer

class QueueTest extends AnyFlatSpec {

  behavior of "DoubleQueue"

  it should "enQueue" in {
    val list1 = ListBuffer(1, 2, 3, 4, 5)
    val doubleQueueObject = new DoubleQueue()
    val list2 = new ListBuffer[Int]()
    while(list1.nonEmpty){
      val poppedElement = doubleQueueObject.deQueue(list1)
      doubleQueueObject.enQueue(list2,poppedElement)
    }
   assertResult(ListBuffer(2,4,6,8,10))(list2)
  }

  it should "deQueue" in {
    val list1 = ListBuffer(1, 2, 3, 4, 5)
    val doubleQueueObject = new DoubleQueue()
    val poppedElement = doubleQueueObject.deQueue(list1)
    assertResult(1)(poppedElement)
  }



behavior of "SquareQueue"

it should "enQueue" in {
  val list1 = ListBuffer(2,4,6,8,10)
  val squareQueueObject = new SquareQueue()
  val list2 = new ListBuffer[Int]()
  while(list1.nonEmpty){
  val poppedElement = squareQueueObject.deQueue(list1)
  squareQueueObject.enQueue(list2,poppedElement)
}
  assertResult(ListBuffer(4,16,36,64,100))(list2)
}

  it should "deQueue" in {
  val list1 = ListBuffer(6, 2, 3, 4, 5)
  val squareQueueObject = new SquareQueue()
  val poppedElement = squareQueueObject.deQueue(list1)
  assertResult(6)(poppedElement)
}

}
