object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(31); 
  
  val x = new Rational(1,2);System.out.println("""x  : Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(2,3);System.out.println("""y  : Rational = """ + $show(y ));$skip(11); 
  x.add(y);$skip(8); val res$0 = 
  x.neg;System.out.println("""res0: Rational = """ + $show(res$0));$skip(11); 
  x.sub(y)}
}

class Rational(x: Int, y: Int) {
	def numer = x
	def denum = y
	
	def add(that: Rational) {
		new Rational(
			numer*that.denum + denum*that.numer,
			denum*that.denum)
	}
	
	def neg: Rational = new Rational(-numer, denum)
	
	def sub(that: Rational) = add(that.neg)
	
	override def toString = numer + "/" + denum
}
