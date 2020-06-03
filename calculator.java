package calculator;

public class Calculator{
if(text.isEmpty()){
return 0;

}else if (text.contains(",")){
String[] tokens = text.split(",");
return Integer.parse(tokens[0])+ toInt (tokens[1]);
}else {
return toInt(text);
}

}
