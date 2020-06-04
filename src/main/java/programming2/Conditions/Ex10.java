package programming2.Conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {
    //Ввести с клавиатуры строку и число N.
    //Вывести на экран строку N раз, используя цикл while.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int num = Integer.parseInt(reader.readLine());
        if (num > 0) {
            while (num > 0) {
                System.out.println(line);
                num--;
            }
        } else System.out.println("Input positive number");

    }
}
