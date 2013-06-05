package forcomp

import Anagrams._

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(118); 

  val a = List(('a', 2), ('b', 1), ('d', 1), ('l', 2), ('r', 1));System.out.println("""a  : List[(Char, Int)] = """ + $show(a ));$skip(55); 
  val b = List(('a', 1), ('b', 1), ('d', 1), ('r', 1));System.out.println("""b  : List[(Char, Int)] = """ + $show(b ));$skip(141); 
    def expr = {
    val x = { print("x"); 1 }
    lazy val y = { print("y"); 2 }
    def z = { print("z"); 3 }
    z + y + x + z + y + x
 };System.out.println("""expr: => Int""");$skip(6); val res$0 = 
 expr;System.out.println("""res0: Int = """ + $show(res$0));$skip(41); val res$1 = 
 
(0 to 4 toList) combinations(3) toList;System.out.println("""res1: List[List[Int]] = """ + $show(res$1))}
                                                  
}
