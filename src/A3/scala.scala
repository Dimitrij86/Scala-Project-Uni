package A3

object scala {
  def main (args: Array[String]): Unit = {
    val x: Int = 49;
    val y: Int = 80;
   val fxi: Int = 5;
   val fxi_1: Int = ((fxi+x/fxi)/2)
    
    // Teilaufgabe 3a
    
     def istGerade (x: Int): Boolean =
      if (x == 0) true else
      if (x%2 == 0) true
      else false
      
    def istUngerade (x: Int): Boolean =
      if (istGerade(x))false
      else
       true
       
     def istGerade1 (x: Int): Boolean =
       if (x==0)true
       else istUngerade1 (x-1)
       
     def istUngerade1 (x: Int): Boolean =
       if (x==0) false
       else istGerade1 (x-1)
       
     //Teilaugabe 3b
       
     def pred(x: Int): Int = x - 1
     
     def succ(x: Int): Int = x + 1
     
     def isZero(x: Int): Boolean = x == 0
     
     def add(x: Int, y: Int): Int =
       if (x==y) pred(x) + succ(x)
       else pred(x) + succ(y)
       
       //Teilaufgabe 3e
       
       def mult (x: Int, y: Int): Int =
         if (isZero(y))0
         else mult (add(x,x), pred(y))
       
       //Teilaufgabe 3d
       
     def sum (x: Int): Int = 
        if (x==0)0 else
        x+sum (x-1)
     
        def sumN(x: Int, y: Int): Int =
       
       if (x>y)0 else
         if (x==y) (2*(x+sum (x-1)))
       else (sum (y)) - (sum (x))
       
       //Teilaufgabe 3e
       def root(x: Float): Float =
         if (x==0)1
         else newton (x,1)
         def newton (x: Float, fxi: Float): Float =
      
           if (fxi_1 == fxi) fxi
           else newton (x, fxi_1)
         
       println("Die Zahl " + x + " ist gerade: " + istGerade(x))
       println("Die Zahl " + x + " ist ungerade: " + istUngerade(x))
       println("Die Zahl " + x + " ist Gerade: " + istGerade1(x), "oder Ungerade: " +istUngerade(x) )
       println("Die Summe der beiden Zahlen ist " + add(x, y))
       println("Das Produkt der beiden Zahlen ist " + mult(x, y))
       println("Die Summe der Zahlen von " + x + " nach " + y + " ist " + sumN(x, y))
       println("Wurzel von " + x + " ist " +newton(x, fxi))
}
}