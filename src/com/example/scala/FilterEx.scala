package com.example.scala

object FilterEx {
  def main(args: Array[String])
  {
    var a = List.range(1, 10)
    
    var b= a.filter(tmp => tmp%2==0)
    //var b=a.filter(even)
    b.foreach
    {
    println
    }
  }
  
  def even(x:Int):Boolean=
  {
    if(x%2==0)
      return true
    else
      return false
  }
}