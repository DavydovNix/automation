package programming2.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Comparator;

public class Ex3 {
    /*Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
    Случай, когда самых длинных слов может быть несколько, не обрабатывать.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        // Arrays.stream(line.replaceAll("\\pP", " ").split("\\s+")).sorted(Comparator.comparingInt(String.limit(1)))
        Arrays.stream(line.replaceAll("\\pP", " ").split("\\s+")).sorted(Comparator.comparingInt(String::length).reversed())
                .limit(1).forEach(m -> System.out.println(m));
        /* String maxLegthWord;
        String[] words;
        words = line.split(" ");
        maxLegthWord = words[0];
        for (int i = 0; i <words.length ; i++) {
            if(maxLegthWord.length()<words[i].length()){
                maxLegthWord = words[i];
            }
        }
        System.out.println(maxLegthWord);*/
    }
}
