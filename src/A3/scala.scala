package A3

object scala {
  def main (args: Array[String]): Unit = {
    val x: Int = 15;
    val y: Int = 80;
   
    
    // Teilaufgabe 3a
    
     def istGerade (x: Int): Boolean =
      if (x == 0) true else
      if (x%2 == 0) true
      else false
      
    def istUngerade (x: Int): Boolean =
      if (istGerade(x))false
      else
       true
       
     //Teilaugabe 3b
       
     def pred(x: Int): Int = x - 1
     
     def succ(x: Int): Int = x + 1
     
     def isZero(x: Int): Boolean = x == 0
     
     def add(x: Int, y: Int): Int =
       if (x==y) pred(x) + succ(x)
       else pred(x) + succ(y)
       
       //Teilaufgabe 3d
       
     def sum (x: Int): Int = 
        if (x==0)0 else
        x+sum (x-1)
     
        def sumN(x: Int, y: Int): Int =
       
       if (x>y)0 else
         if (x==y) (2*(x+sum (x-1)))
       else (sum (y)) - (sum (x))
       
       println("Die Zahl " + x + " ist gerade: " + istGerade(x))
       println("Die Zahl " + x + " ist ungerade: " + istUngerade(x))
       println("Die Summe der beiden Zahlen ist " + add(x, y))
       println("Die Summe der Zahlen von " + x + "nach " + y + " ist " + sumN(x, y))
}
}