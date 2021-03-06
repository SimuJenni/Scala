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
  def pascal(c: Int, r: Int): Int = {
    if((c==0)||(c==r)) 1
    else pascal(c-1, r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def newCount(char: Char, count: Int): Int = {
      if(char.equals('(')) count+1
      else {
        if(char.equals(')')) count-1
        else count
      }
    }
    def checkBalance(testChars: List[Char], count: Int): Boolean = {
      if(count<0) false
      else {
        if(testChars.tail.isEmpty) newCount(testChars.head, count)==0
        else checkBalance(testChars.tail, newCount(testChars.head, count))
      }
    }
    checkBalance(chars, 0)
  }

  /**
   * Exercise 3
   */
   def countChange(money: Int, coins: List[Int]): Int = {
     if(coins.isEmpty||money<0) 0
     else {
       if(money==0) 1
       else countChange(money-coins.head, coins)+countChange(money,coins.tail)
     }
   }      
 }
