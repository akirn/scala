package patmat

import Huffman._

object session {
  type Occurrences = List[(Char, Int)]
  type Word = String
  type Sentence = List[Word];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(334); 
  
  def wordOccurrences(w: Word): Occurrences = {
    w.toLowerCase
     .filter(x => x isLetter)
     .groupBy(y => y)
     .mapValues(z => z.size)
     .toList
     .sortWith(_._1 < _._1)
  };System.out.println("""wordOccurrences: (w: patmat.session.Word)patmat.session.Occurrences""");$skip(79); val res$0 = 
                                                  
  wordOccurrences("Ismael");System.out.println("""res0: patmat.session.Occurrences = """ + $show(res$0));$skip(143); 
                                                  
  def sentenceOccurrences(s: Sentence): Occurrences = {
    wordOccurrences(s.mkString)
  };System.out.println("""sentenceOccurrences: (s: patmat.session.Sentence)patmat.session.Occurrences""");$skip(167); val res$1 = 
                                                 
                                                  
  sentenceOccurrences(List("Ismael","is","my","Captain","chief"));System.out.println("""res1: patmat.session.Occurrences = """ + $show(res$1));$skip(84); val res$2 = 
  
  List(('e',1), ('s',1), ('a',1), ('m',1), ('i',1), ('i', 1), ('a', 1), ('a',1));System.out.println("""res2: List[(Char, Int)] = """ + $show(res$2));$skip(354); 
                                                  

  def combine(x: (Char, Int), lst: List[(Char, Int)]) = (x, lst) match {
	  case (_, Nil) => List(x)
	  case ((a, b), (c, d) :: rest) => if (a == c)
	                                     (a, c + 1) :: rest
	                                   else
	                                     (a, b) :: lst
	};System.out.println("""combine: (x: (Char, Int), lst: List[(Char, Int)])List[(Char, Int)]""");$skip(121); val res$3 = 
	
	List(('e',1), ('s',1), ('a',1), ('m',1), ('i',1), ('i', 1), ('a', 1), ('a',1)).foldRight(List[(Char,Int)]())(combine);System.out.println("""res3: List[(Char, Int)] = """ + $show(res$3))}
}
