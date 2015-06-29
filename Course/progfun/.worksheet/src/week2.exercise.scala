package week2

object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(160); 
	def factorial (n: Int) = {
		def loop (acc: Int, x: Int): Int = {
			if (x==1) acc
			else loop(acc*x, x-1)
		}
		loop(1,n)
	};System.out.println("""factorial: (n: Int)Int""");$skip(14); val res$0 = 
	factorial(4);System.out.println("""res0: Int = """ + $show(res$0))}
}
