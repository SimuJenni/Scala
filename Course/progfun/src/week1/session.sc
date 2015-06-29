package week1

object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def abs(x: Double): Double =
		    if (x >= 0) return x else return -x
                                                  //> abs: (x: Double)Double
		    
	def sqrt(x: Double): Double ={
	
	  def sqrtItr(guess: Double): Double =
	    if (isGoodEnough(guess)) return guess
	    else return sqrtItr(improve(guess))
	
	  def isGoodEnough(guess: Double): Boolean =
	    abs(guess * guess/x-1)  < 0.001
	
	  def improve(guess: Double): Double =
	    (guess + x / guess) / 2

	  sqrtItr(1.0)
	  
	}                                         //> sqrt: (x: Double)Double
  sqrt(0.001)                                     //> res0: Double = 0.03162278245070105
  sqrt(0.1e-20)                                   //> res1: Double = 3.1633394544890125E-11
  sqrt(1.0e20)                                    //> res2: Double = 1.0000021484861237E10
  sqrt(1.0e50)                                    //> res3: Double = 1.0000003807575104E25
  sqrt(1e-6)                                      //> res4: Double = 0.0010000001533016628
  sqrt(1e60)                                      //> res5: Double = 1.0000788456669446E30

}

/*
def abs(x:Double) = if (x < 0) -x else x

def sqrtIter(guess: Double, x: Double): Double =
   if (isGoodEnough(guess, x)) guess
   else sqrtIter(improve(guess, x), x)

def isGoodEnough(guess: Double, x: Double) = ???

def improve(guess: Double, x: Double) =
   (guess + x / guess) / 2

def sqrt(x: Double) = sqrtIter(1.0, x)
*/