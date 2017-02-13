package com.example.scala
import scala.collection.mutable.Map
object MapEx {
  def main(args: Array[String])
  {
    var marks = Map("a"-> 5, "b" -> 6, "c" -> 3)
    
    marks += ("d" -> 5)
    marks -= "a"
    marks("b") = 8
    
    for((k,v) <- marks)
      println("key: "+k+" Value: "+v)
  }
}