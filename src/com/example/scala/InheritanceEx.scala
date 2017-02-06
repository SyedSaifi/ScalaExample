package com.example.scala

class PointOne(val xc: Int, val yc: Int){
  var x: Int = xc;
  var y: Int = yc;
  
  def move(xd: Int, yd: Int){
   x = x + xd;
   y = y+ yd;
   println ("Point x location : " + x);
   println ("Point y location : " + y);
  }
}

class Location(override val xc: Int, override val yc: Int,
   val zc :Int) extends PointOne(xc, yc){
   var z: Int = zc

   def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
   }
}

object InheritanceEx {
  def main(args: Array[String]) {
    val loc = new Location(10, 20, 30);
    loc.move(10, 20, 30);
  }
}