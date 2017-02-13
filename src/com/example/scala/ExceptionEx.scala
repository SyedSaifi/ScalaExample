package com.example.scala

object ExceptionEx {
  
  def main(args: Array[String])
  {
  var a:Int=10
  var b:Int=0
  
  try
  {
    print(a/b)
  }
  catch
  {
    case ex:ArithmeticException => print("ArithmeticException caught")
    case ex:Exception => print("Exception caught")
  }
  }
}