package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(73); 

	def abs(x: Double): Double =
		    if (x >= 0) return x else return -x;System.out.println("""abs: (x: Double)Double""");$skip(345); 
		    
	def sqrt(x: Double): Double ={
	
	  def sqrtItr(guess: Double): Double =
	    if (isGoodEnough(guess)) return guess
	    else return sqrtItr(improve(guess))
	
	  def isGoodEnough(guess: Double): Boolean =
	    abs(guess * guess/x-1)  < 0.001
	
	  def improve(guess: Double): Double =
	    (guess + x / guess) / 2

	  sqrtItr(1.0)
	  
	};System.out.println("""sqrt: (x: Double)Double""");$skip(14); val res$0 = 
  sqrt(0.001);System.out.println("""res0: Double = """ + $show(res$0));$skip(16); val res$1 = 
  sqrt(0.1e-20);System.out.println("""res1: Double = """ + $show(res$1));$skip(15); val res$2 = 
  sqrt(1.0e20);System.out.println("""res2: Double = """ + $show(res$2));$skip(15); val res$3 = 
  sqrt(1.0e50);System.out.println("""res3: Double = """ + $show(res$3));$skip(13); val res$4 = 
  sqrt(1e-6);System.out.println("""res4: Double = """ + $show(res$4));$skip(13); val res$5 = 
  sqrt(1e60);System.out.println("""res5: Double = """ + $show(res$5))}

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
