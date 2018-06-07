 package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {

  private FizzBuzz fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new FizzBuzz();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }
    public void testNegativeTen () {
      assertNull(fixture.fizzBuzz(-10));
    }

  public void testPositiveNumber7() {
    assertArrayEquals(new String[] {"1", "2", "Fizz", "4",
            "Buzz", "Fizz", "7"}, FizzBuzz.fizzBuzz(7));
  }
  public void testPositiveNumber1() {
    List<String> actual = Arrays.asList("1");
    a
  }


