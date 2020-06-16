package programming2.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Ex1 {
    /*Дана строка. Вывести первый, последний и средний (если он есть) символы. Напишите программу, которая выводит часть строки
     до первой встреченной точки, включая точку. Также предусмотрите вывод количества пробелов.*/
    public static void main(String[] args) throws IOException {
        String s = "it's my own row . I'm not going to write another one";
        int countSpaces = 0;
        char sf1 = s.charAt(0);
        System.out.println("First symbol is: " + sf1);
        System.out.println("Middle symbol is:" + s.charAt(s.length() / 2));
        System.out.println("Last symbol is: " + s.charAt(s.length() - 1));
        System.out.println("part of string before first dot: " + (s.indexOf(".") != -1 ? s.substring(0, s.indexOf(".") + 1) : "string doesn't have any dots"));
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                countSpaces++;
            }
            String spaces = String.format("countSpaces = %d", countSpaces);
            JOptionPane.showMessageDialog(null, spaces);
            System.exit(0);
        }
    }
}
