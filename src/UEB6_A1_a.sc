object UEB6_A1_a {
  println("Welcome to the Scala worksheet") }
  
def map [A, B] (as: List [A]) (f: A => B) : List [B] =
 as match {
 case List () => List ()
 case (x :: xs) => f(x) :: map (f)(xs)
 }
/* def map [A, B] (as: List [A]) (f: A => B) : List [B] =
for (x <- as) yield f(x) */

