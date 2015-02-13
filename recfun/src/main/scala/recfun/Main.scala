package recfun

import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    println("isBalnaced: " + balance("a(asd)".toList))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceRec(chars: List[Char], count: Int): Boolean = {
      if (chars.isEmpty) count == 0
      else {
        val open = {
          if (chars.head == '(') count + 1
          else if (chars.head == ')') count - 1
          else count
        }
        if (open >= 0) balanceRec(chars.tail, open)
        else false
      }
    }
    balanceRec(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
