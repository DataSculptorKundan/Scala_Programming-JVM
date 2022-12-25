package Scala_Exercise

object Functions_Exercise extends App {

  /*
      1. A greeting function (name,age) ==> "Hi, my name is $name and i am $age years old"
      2. Factorial functions 1 * 2 * 3 * ......* n
      3. A Fibonacci functions
        f(1) = 1
        f(2) = 1
        f(3) = f(n-1) + f(n-2)
      4. Test if number is prime.
  */

  // A greeting function (name,age) ==> "Hi, my name is $name and i am $age years old"
  def aGreetingFunctions(name: String, age: Int): String = {
    "Hi, My name is " + name + " and I am " + age + " years old."
  }
  println(aGreetingFunctions("Kundan", 28))

  // Factorial functions 1 * 2 * 3 * ......* n

  def aFactorialFunctions(n: Int) : Int = {
    if (n <= 0) 1
    else n * aFactorialFunctions(n-1)
  }
  println(aFactorialFunctions(4))

  // A Fibonacci functions

  def aFibonacciFunction(n: Int): Int = {
    if (n <= 2) 1
    else aFibonacciFunction(n-1) + aFibonacciFunction(n-2)
  }
  println(aFibonacciFunction(8))  // 1 1 2 3 5 8 13 21 34

  //Test if number is prime.

  def isPrimeNumber(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }
  println(isPrimeNumber(37))
  println(isPrimeNumber(2003))
  println(isPrimeNumber(37 * 17))
}
