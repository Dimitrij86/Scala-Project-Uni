package mypackage {
object MyObject {
def main (args: Array[String]): Unit = {
      val n : Int = 5;
      val a : Int = 1;
      val b : Int = 3;
      
     // Teilaufgabe a)
      
      def sumN (x:Int):Int = (x * (x+1) / 2)
        
      // Teilaufgabe b)
        
      def sumFromTo (y:Int, z:Int): Int =
        
        if (z<=y)0
        
        else (sumN(z)) - (sumN(y)-1)
        
        //Teilaufgabe c)
      
      def sumOddN (x: Int): Int =
      
     2*(sumN (x))-x
     
     def sumOddN2 (x: Int): Int =
       sumN(x) + sumN (x-1)
   
  println(" Die Summe der ersten Zahlen bis " + (n) +  " ist " + sumN (n))
  println(" Die Summe der Zahlen von " + a + " bis "+ b + " ist " + sumFromTo (a, b))
  println(" Die Summe der ersten ungeraden Zahlen ist " + sumOddN (n))
  println(" Die Summe der ersten ungeraden Zahlen ist " + sumOddN2 (n))
}
}
}