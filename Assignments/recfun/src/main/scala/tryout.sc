object tryout {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
    def newCount(char: Char, count: Int): Int = {
      if(char.equals('(')) count+1
      else {
      	if(char.equals(')')) count-1
      	else count
      }
    }                                             //> newCount: (char: Char, count: Int)Int
    def test(char: Char): Char = char             //> test: (char: Char)Char
  def balance(chars: List[Char]): Boolean = {

    def checkBalance(testChars: List[Char], count: Int): Boolean = {
      if(testChars.tail.isEmpty) newCount(testChars.head, count)==0
      else checkBalance(testChars.tail, newCount(testChars.head, count))
    }
    checkBalance(chars, 0)
  }                                               //> balance: (chars: List[Char])Boolean
  test('(')                                       //> res0: Char = (
  '('                                             //> res1: Char('(') = (
  newCount('(',0)                                 //> res2: Int = 1
  "()".toList.head.equals('(')                    //> res3: Boolean = true
  
  balance("()".toList)                            //> res4: Boolean = true
}