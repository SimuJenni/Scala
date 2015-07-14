object tryout {
   def countChange(money: Int, coins: List[Int]): Int = {
   if(coins.isEmpty||money<0) 0
   else {
   	if(money==0) 1
   	else countChange(money-coins.head, coins)+countChange(money,coins.tail)
   }
   }                                              //> countChange: (money: Int, coins: List[Int])Int
 	countChange(300,List(500,5,50,100,20,200,10))
                                                  //> res0: Int = 1022
 
}

class Rational {

}