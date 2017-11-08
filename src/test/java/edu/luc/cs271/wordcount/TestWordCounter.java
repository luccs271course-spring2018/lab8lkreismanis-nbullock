package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter

  @Before
  public void setUp() {
    // DONE create the SUT instance
    fixture = new Map<>();
  }

  @After
  public void tearDown() {
    // DONE set the SUT instance to null
    fixture = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    fail();
  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    final String value1 = "hello";
    final String value2 = "hello";
    fixture.offer(value1);
    fixture.offer(value2);
    final List<String> list = fixture.asList();
    assertEquals(2, list.size());
    assertEquals(Arrays.asList(value2, value2), list);
    // fail();

  }
}
