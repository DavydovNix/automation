package programming2.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PZ1 {
    /*Дана строка. Вывести первый, последний и средний (если он есть)
     символы. Напишите программу, которая выводит часть строки
     до первой встреченной точки, включая точку. Также предусмотрите
     вывод количества пробелов.*/

    public static void main(String[] args) throws IOException {
       String s = "it's my own row.I'm not going to write another one";
String[] arrayS = s.split(".");
        System.out.println(arrayS[0]);
        /*for (String element:arrayS) {
            System.out.println(element);
        }*/

    }


}
