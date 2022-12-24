package Scala_Basics

object ValuesVariablesTypes_2 extends App {
  //values

  val x : Int = 27  //value assigned
   println(x)

  val y = 37  //COMPILER CAN INFER THE TYPES
  println(y)

   //VAL ARE IMMUTABLE

   val aSting : String = "hello Scala"
   val anotherString : String = "I am here to learn you"


   val aBoolean : Boolean = true; val anotherBoolean : Boolean = false
   val aChar : Char = 'Y'
   val aInt : Int = 97
   val aShort : Short = 4568
   val aLong : Long = 45625856957896L
   val aFloat : Float = 2.0f
   val aDouble : Double = 5.36

  //variables

  var aVariable : Int = 1

  aVariable = 7     //Side effect of var because it can be reassigned.
  println(aVariable)
}
