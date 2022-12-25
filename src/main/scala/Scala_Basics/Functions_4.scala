package Scala_Basics

object Functions_4 extends App {
  def aFunctions(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunctions("Hello !!", 7))

  def aParameterLessFunction(): Int = 47
  println(aParameterLessFunction())
  // println(aParameterLessFunction)

  def aRepeatFunction(aString: String, aInt: Int): String = {
    if (aInt == 1) aString
    else aString + aRepeatFunction(aString, aInt-1)
  }
  println(aRepeatFunction("Kundan",3))

  // WHEN WE NEED TO USE, WE CAN USE RECURSION..

  def aFunctionsWithSideEffect(aString: String): Unit = println(aString)

  def aBigFunctions(n: Int): Int = {
    def aSmallFunctions(a: Int, b: Int): Int = a + b
    aSmallFunctions(n, n-1)
  }
  println(aBigFunctions(20))
  
}
