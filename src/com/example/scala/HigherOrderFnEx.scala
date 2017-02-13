package com.example.scala

object HigherOrderFnEx {
  
  def perform(f:(Int,Int)=>Int)
  {
    println("Result :: "+f(10,20))
  }
  
  def main(args:Array[String])
  {
    perform((x:Int,y:Int)=>x+y)
  }
}