package calculator;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest{
@Test
public void returnZeroOnEmptyString(){
assertEquals(0, Calculator.add(""));
}
@Test
  public returnNumberSingle(){
  assertEquals(1, Calculator.add("1"));
  }
  
@Test 
  public void returnSumOfTwoNumbers(){
  assertEquals(3, Calculator.add("1,2"));
  }
  @Test
  public void returnMultipleNUmbers(){
  
  }
}
