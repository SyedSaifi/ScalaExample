package com.example.scala

object ArrayExample {
  def main(args:Array[String]){
    var arr:Array[Int] = new Array[Int](3)
    
    arr(0) = 11
    arr(1) = 22
    arr(2) = 33
    
    for(i<- 0 to 2)
      println(arr(i))
      
    /*for(temp <- arr)
      println(temp)*/
      
   //Two dimentional array
   var darr = Array.ofDim[Int](2,2);
   darr(0)(0) = 20;
   darr(0)(1) = 21;
   darr(1)(0) = 10;
   darr(1)(1) = 11;
   
   for(i<- 0 to 1; j<- 0 to 1)
     println(darr(i)(j))
  }
}