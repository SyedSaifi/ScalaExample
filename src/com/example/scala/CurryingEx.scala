package com.example.scala

object CurryingEx {
  
  def add(x:Int)=
  {
    (y:Int)=>x+y
  }
  
  def main(args: Array[String])
  {
    println("Result :: "+add(12)(13))
  }
}