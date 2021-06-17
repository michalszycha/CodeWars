package NarcissisticNumber

// https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/scala


object Narcissistic {

  def narcissistic(n: Int): Boolean = {
    var sum: Double = 0
    for(i <- n.toString.split("").map((_.trim))) {
      sum+=scala.math.pow(i.toInt, n.toString.length())
    }
    if (sum == n) true else false
  }

  def main(args: Array[String]): Unit = {
    println(narcissistic(7))
    println(narcissistic(371))
    println(narcissistic(122))
    println(narcissistic(4887))
  }

}
