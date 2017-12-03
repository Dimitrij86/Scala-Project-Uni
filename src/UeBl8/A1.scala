package UeBl8

object A1 {
  abstract class Baum [A, B]
  case class Knoten [A, B]
  (value: A, left: Baum [A, B], right: Baum [A, B])
  extends Baum [A, B]
  case class Blatt [A, B] (value: B) extends Baum [A, B]
  
  object Op extends Enumeration {
    type Op = Value
    val Plus = Value ("+")
    val Mal = Value ("*")
    }
    import Op._
    
  type ArithBaum = Baum [Op, Int]
  
  abstract class Inhalt [A, B]
  case class KnotenInhalt [A, B] (value: A) extends Inhalt [A, B]
  case class BlattInhalt [A, B] (value: B) extends Inhalt [A, B]
  
  // teilaufgabe 1a
  def formel (A: ArithBaum, B: ArithBaum): Int =
  A, B match {
  case Leer () => Leer ();
  case (A, left, right) =>
    Knoten (Mal, 
        Knoten (Plus, 3, 7),
        Knoten (Mal, 6,
            Knoten (Plus, 5, 2))
  }
  println (formel (A, B))
  
  //Teilaufgabe 1b
  def zeigeBaum (A: ArithBaum): String = 
      Knoten (Mal, 
        Knoten (Plus, 3, 7),
        Knoten (Mal, 6,
            Knoten (Plus, 5, 2))
  print (zeigeBaum (A, B))
  
  
  //Teilaufgabe 1c
  def toList [A, B] (b: Baum[A, B]) : List [Inhalt [A, B]] =
  b match {
    case Leer () => List ();
    case BlattInhalt => toList (B.toList);
    case KnotenInhalt => toList (A.toList);
    }
}