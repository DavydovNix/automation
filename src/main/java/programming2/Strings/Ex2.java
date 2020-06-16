package programming2.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
    /*Найти в строке указанную подстроку и заменить ее на новую.
    Строку, ее подстроку для замены и новую подстроку вводит пользователь.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input row ");
        String row = reader.readLine();
        System.out.println("Input searching subrow");
        String searching_substring = reader.readLine();
        if (row.indexOf(searching_substring) != -1) {
            System.out.println("Input new subrow");
            String new_substring = reader.readLine();
            String last_row = row.replace(searching_substring, new_substring);
            System.out.println(last_row);
        } else System.out.println("subrow not found");
    }
}
