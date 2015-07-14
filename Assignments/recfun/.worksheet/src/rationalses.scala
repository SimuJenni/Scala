object rationalses {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(31); 
  
  val x = new Rational(1,2);System.out.println("""x  : Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(2,3);System.out.println("""y  : Rational = """ + $show(y ));$skip(11); 
  x.add(y)}
}

class Rational(x: Int, y: Int) {
	def numer = x
	def denum = y
	
	def add(that: Rational) {
		new Rational(
			numer*that.denum + denum*that.numer,
			denum*that.denum)
	}
	
	def
	
	override def toString = numer + "/" + denum
}
