package Scala_Basics

object Expressions_3 extends App {

  val x = 1 + 3  //Expression
  println(x)

  println(5 + 6 * 2)
  // + - * / & | ^ << >>  >>> (right shift with zero expression)

  println(1 == x)
  // == != > >= < <=

  println(!(1 ==x))
  // ! && ||

  var aVariable = 5
  aVariable += 4    // also works with -= += *= /= ......side effects
  println(aVariable)


  // Instructions (DO) vs Expressions (VALUE)

  // IF Expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 //If expression
  println(aConditionValue)
  println(if(aCondition) 5 else 3)    //If expression in println
  println(9+8)

  // While loop
  var InitializeValue = 1
  while (InitializeValue <= 5) {
    println(InitializeValue)
    InitializeValue += 1
  }       //NEVER WRITE THIS AGAIN !!

  // EVERYTHING IN SCALA IN AN EXPRESSION.
  val aWeirdValue = (aVariable = 3)   //Unit === void
  println(aWeirdValue)

  var aInitializeValue = 1
  val aWhile = while (aInitializeValue <= 7) {
    println(aInitializeValue)
    aInitializeValue += 1
  }

  //Side Effects : println(), whiles, reassigning

  // Code Blocks
  val aCodeBlock = {
    val x = 27
    val y = x + 10

    val z = if (y >= 40) "hello !!" else "GoodBye !!"
    println(z)
  }

  // 1. what's the difference between "hello world" and println("hello world")
      // "hello world" --> value of type is String
      // println("hello world") --> value of expression and its type is Unit and print is on console

  // 2.
    val someValue = {
      2 < 3
    }   // Boolean
  println(someValue)

    val someOtherValue = {
      if (someValue) 239 else 986 // This expression is completely irrelevant
      43
    }
    println(someOtherValue) // 43
}
