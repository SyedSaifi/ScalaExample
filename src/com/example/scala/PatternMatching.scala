package com.example.scala

object PatternMatching {
  
  def find(x:Any):Any = x match
  {
    case 1=> "Hello"
    case "john"=>"Hello john"
    case _ => "Default"
  }
  
  def main(args: Array[String])
  {
    println(find("john"))
  }
}