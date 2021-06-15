package RomanNumeralsDecoder

import scala.util.control.Breaks.break

object RomanNumeralsDecoder {

  def decode(roman:String): Int = {
    val RomanNumeralsMap:Map[String, Int] = Map ("M" -> 1000, "D" -> 500, "C" -> 100,
      "L" -> 50, "X" -> 10, "V" -> 5, "I" -> 1)
    var num: Int = 0
    var romanArray: Array[String] = roman.split("").map((_.trim))
    var i: Int = 0
    while(i < romanArray.length) {
      if (i > 0 && RomanNumeralsMap(romanArray(i)) > RomanNumeralsMap(romanArray(i-1))) {
        num-=RomanNumeralsMap(romanArray(i-1))
        num+=(RomanNumeralsMap(romanArray(i))-RomanNumeralsMap(romanArray(i-1)))
      } else {
        num+=RomanNumeralsMap(romanArray(i))
      }
      i+=1
    }
    num
  }

  def main(args: Array[String]): Unit = {
    println(decode("I"))
    println(decode("IV"))
    println(decode("MMVIII"))
    println(decode("MCMXC"))
  }

}
