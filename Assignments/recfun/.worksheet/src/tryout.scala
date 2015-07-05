object tryout {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(220); 
   def countChange(money: Int, coins: List[Int]): Int = {
   if(coins.isEmpty||money<0) 0
   else {
   	if(money==0) 1
   	else countChange(money-coins.head, coins)+countChange(money,coins.tail)
   }
   };System.out.println("""countChange: (money: Int, coins: List[Int])Int""");$skip(48); val res$0 = 
 	countChange(300,List(500,5,50,100,20,200,10));System.out.println("""res0: Int = """ + $show(res$0))}
 
}
