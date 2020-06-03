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
      assertEquals(6, Calculator.add("1,2,3"));
  
  }
  @Test
  public void shouldAcceptNewLinAsValidDelimeter(){
      assertEquals(6, Calculator.add("1,2\n3"));
  }
  @Test
  public void shouldAcceptDelimiterSyntax(){
  assertEquals(3, Calculator.add("//:\n1;2"))}
}
