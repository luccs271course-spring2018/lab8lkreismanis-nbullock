package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // DONE complete this test class

  // DONE declare a reference to the SUT (system under test), i.e., WordCounter

  private WordCounter fixture;

  @Before
  public void setUp() {
    // DONE create the SUT instance
    Map<String, Integer> newMap = new HashMap<String, Integer>();
    fixture = new WordCounter(newMap);
  }

  @After
  public void tearDown() {
    // DONE set the SUT instance to null
    fixture = null;
  }

  @Test
  public void testGetCountEmpty() {

    // DONE verify that the SUT initially returns an empty map
    assertEquals(fixture.getCounts(), Collections.emptyMap());
  }

  @Test
  public void testGetCountNonEmpty() {

    // DONE run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    ArrayList<String> list = new ArrayList<>();
    list.addAll(Arrays.asList("hello", "world", "hello", "man", "cat"));
    Iterator<String> testMap = list.iterator();
    fixture.countWords(testMap);
    assertEquals(fixture.getCount("world"), 1);
    assertEquals(fixture.getCount("hello"), 2);
    assertEquals(fixture.getCount("cow"), 0);
    assertEquals(fixture.getCount("dog"), 0);
    // fail();
  }
}
