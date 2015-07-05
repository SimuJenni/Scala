object tryout {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(166); 
    def newCount(char: Char, count: Int): Int = {
      if(char.equals('(')) count+1
      else {
      	if(char.equals(')')) count-1
      	else count
      }
    };System.out.println("""newCount: (char: Char, count: Int)Int""");$skip(38); 
    def test(char: Char): Char = char;System.out.println("""test: (char: Char)Char""");$skip(294); 
  def balance(chars: List[Char]): Boolean = {

    def checkBalance(testChars: List[Char], count: Int): Boolean = {
      if(testChars.tail.isEmpty) newCount(testChars.head, count)==0
      else checkBalance(testChars.tail, newCount(testChars.head, count))
    }
    checkBalance(chars, 0)
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(12); val res$0 = 
  test('(');System.out.println("""res0: Char = """ + $show(res$0));$skip(6); val res$1 = 
  '(';System.out.println("""res1: Char('(') = """ + $show(res$1));$skip(18); val res$2 = 
  newCount('(',0);System.out.println("""res2: Int = """ + $show(res$2));$skip(31); val res$3 = 
  "()".toList.head.equals('(');System.out.println("""res3: Boolean = """ + $show(res$3));$skip(26); val res$4 = 
  
  balance("()".toList);System.out.println("""res4: Boolean = """ + $show(res$4))}
}
