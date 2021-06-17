package BreakChocolate

// https://www.codewars.com/kata/534ea96ebb17181947000ada/train/scala

object BreakChocolate {

  def breakChocolate(n: Int, m: Int) = {
    if (n>0 && m>0) n*m-1 else 0
  }

  def main(args: Array[String]): Unit = {
    println(breakChocolate(5,5))
  }
}
