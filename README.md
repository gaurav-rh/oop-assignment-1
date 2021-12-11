# oop-assignment-1
## This project is a modified implementation of Queue Using ListBuffer. It has two classes, one Trait and one Object.

**Queue**
This trait has one abstract method and one method.
  - enQueue
  - deQueue --> it has concrete implementation which returns the dequeued element.

**DoubleQueue**
-This class extends Queue trait and implements enqueue method such that it adds double of the element to be inserted in the queue.

**SquareQueue**
-This class extends Queue trait and implements enqueue method such that it adds square of the element to be inserted in the queue.

**QueueTester**
-This scala object is used to check functionalities of DoubleQueue and SquareQue

***QueueTest***
-This is a test class which makes use of AnyFlatSpec style of ScalaTest

### To run this project one has to open QueueTester Object where a ListBuffer has been added for implementation project . Anyone can change that list and Use accordingly
