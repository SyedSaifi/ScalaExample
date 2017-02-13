package com.example.scala

object AnonymousFunctionEx {
  
  def main(args: Array[String])
  {
  var f = (x:Int, y:Int)=>{
    var z:Int = x+y
    println("The sum is :: "+ z)
  }
  
  f(3,4)
  }
}