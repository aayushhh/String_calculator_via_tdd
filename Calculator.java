package calculator;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest() {
@Test
public void returnZeroOnEmtyString(){
assertEquals(0, Calculator.add(""));
}

}
