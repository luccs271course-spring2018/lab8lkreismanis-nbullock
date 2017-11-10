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

    // DONE for each word in the iterator, update the corresponding frequency in the map
    // HINT to do this without a conditional, use the getOrDefault method
    while (words.hasNext()) {
      String temp = words.next();
      // System.out.println("word:");  //break the iterator loop here
      // once you break it, print map out
      //
      // System.out.println(temp);
      int number = theMap.getOrDefault(temp, 0);
      theMap.put(temp, number++);
    }
  }

  /** Retrieve the frequency of a particular word. */
  public int getCount(final String word) {

    // DONE
    int count = theMap.get(word);
    if (theMap.containsKey(word)) {
      return count;
    } else {
      return 0;
    }
  }

  /** Retrieve the map representing all word frequencies. */
  public Map<String, Integer> getCounts() {
    return Collections.unmodifiableMap(theMap);
  }
}
