package com.example.scala

object ListEx {
  def main(args: Array[String])
  {
    var a=List(3)
    a= 1::2::a
    
    var b=List.range(4, 10, 2)
    
    var c=List.tabulate(3)(a=>a*a*a)
    
    var d=List.fill(2)(100)
    
    var e= a ::: b ::: c :::d
    
    e.foreach
    {
    	println(_)
    }
  }
}