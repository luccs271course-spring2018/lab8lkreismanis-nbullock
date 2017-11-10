package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {
    
    //File lesmiserables = new File("book.txt");
    //BufferedReader reader = new BufferedReader(new FileReader(lesmiserables));

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // TODO complete this main program
    // 1. create a WordCounter instance
    Map<String, Integer> newMap = new HashMap<String, Integer>();
    WordCounter wc = new WordCounter(newMap); 

    // 2. use this to count the words in the input
    wc.countWords(input);

    // 3. determine the size of the resulting map
    int sizeOfMap = wc.getCounts().size();

    // 4. create an ArrayList of that size and
    ArrayList<Map.Entry<String, Integer>> newList = new ArrayList<Map.Entry<String, Integer>>(sizeOfMap);

    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>

    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the
    // latter)
    Collections.sort(newList, new DescendingByCount());

    // 7. print the (up to) ten most frequent words in the text
    for (int i = 0; i <= 10; i++) {
      System.out.println(" " + newList.get(i));
    }
  }
}
