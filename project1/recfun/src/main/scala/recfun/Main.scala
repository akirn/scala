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
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceItr(chars: List[Char], openParens: Int): Boolean =
      if (chars.isEmpty) openParens == 0
      else if (chars.head == '(') balanceItr(chars.tail, openParens + 1)
      else if (chars.head == ')') openParens > 0 && balanceItr(chars.tail, openParens - 1)
      else balanceItr(chars.tail, openParens)

    balanceItr(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def count(money: Int, coins: List[Int]): Int = {
      if (money == 0) 1
      else if (money < 0 || coins.isEmpty) 0
      else count(money, coins.tail) + count(money - coins.head, coins)
    }

    count(money, coins.sorted)
  }
}
