package forcomp
import Anagrams._

object Main extends App {

  val occ = wordOccurrences("master")
  println(dictionaryByOccurrences.get(occ)) //Some(List(master, stream))
                                                 
}