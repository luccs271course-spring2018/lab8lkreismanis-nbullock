package edu.luc.cs271.wordcount;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/** A map-based class for counting word frequencies from an iterator. */
public class WordCounter {

  /** The map for storing the word counts. */
  private final Map<String, Integer> theMap;

  /** Creates a word counter instance based on the given map. */
  public WordCounter(final Map<String, Integer> theMap) {

    // DONE
    this.theMap = theMap;

  }

  /** Counts the frequencies of all words in the given iterator. */
  public void countWords(final Iterator<String> words) {

    // TODO for each word in the iterator, update the corresponding frequency in the map
    // HINT to do this without a conditional, use the getOrDefault method
    int number = 0;
    while(words.hasNext()){
      String temp = words.next();
      if(theMap.contatins(temp)){
        number++;
        theMap.put(temp, number);
      }
      else{
        theMap.put(temp, 1);
      }
    } 
  }

  /** Retrieve the frequency of a particular word. */
  public int getCount(final String word) {

    //DONE
    int count = theMap.get(word);
    return count;

  }

  /** Retrieve the map representing all word frequencies. */
  public Map<String, Integer> getCounts() {
    return Collections.unmodifiableMap(theMap);
  }
}
