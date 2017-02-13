package com.example.scala

object Closure {
  def main(args: Array[String])
  {
    var x:Int = 20
    val z = (z:Int) => x*z
    
    println(z(10))
  }
}