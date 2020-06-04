package programming2.Conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {
    //Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»
    public static final int AGE = 20;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        checkName(name, age);
    }

    public static void checkName(String name, int age) throws IOException {
        if (age > AGE) {
            System.out.println("И 18-ти достаточн");
        }
    }
}
