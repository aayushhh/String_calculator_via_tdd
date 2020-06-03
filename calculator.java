
package calculator;
import ch.lamdaj.function.convert.Converter;
import static ch.lamdaj.Lamda.*;
import java.util.list;

public class Calculator{
  if(text.isEmpty()){
    return 0;
    }
  
  else if (text.contains(",")) {
    
String[] tokens = text.split(",");
    
  List<Integer> numbers = convert(tokens, toInt());
    
  return sum(numbers).intValue();
}
  else {
    return toInt(text);
       }
  
private static Converter<String, Integer>toInt(){
  return new Converter<String, Integer>() {
    
      public Integer convert(String from){
        
          return toInt(from);
      }
  };
}
  private static int toInt(String text) throws NnumberFormatException{
  return Integer.parseInt(text);
  }
  
  
}
