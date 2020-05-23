package programming2.Conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
//Ввести с клавиатуры четыре числа, и вывести максимальное из них.
public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
    double num1  = Double.parseDouble(reader.readLine());
    double num2  = Double.parseDouble(reader.readLine());
    double num3  = Double.parseDouble(reader.readLine());
    double num4  = Double.parseDouble(reader.readLine());
    double s = max(num1,num2,num3,num4);
    System.out.println(s);
}
public static double max(double a,double b){
    return a>b?a:b;
}
public static double max(double a,double b, double c, double d){
    if (max(a,b)>=max(c,d)){
        return max(a,b);
    } else return max(c,d);
}
}
