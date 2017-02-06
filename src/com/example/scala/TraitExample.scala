package com.example.scala

trait shape
{
  def draw()
}

trait dimension
{
  var r:Int
  var d:Int = 10
  def getDimension()
}

class circle extends shape with dimension
{
  var r = d/2
  def draw()
  {
    println("Draw a circle")
  }
  
  def getDimension()
  {
    println("Diameter is :: "+d+" and area is "+2*3.14*r*r)
  }
}

object TraitExample 
{
    def main(args:Array[String])
    {
      var cr = new circle()
      cr.draw()
      cr.getDimension()
    }
}