package programming2.Conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17 {
    /* Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
     Пример текста:
     Света любит меня.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        for (int i = 0; i < 10; i++) {
            //System.out.println(name+" любит меня.");
            String sf = String.format("%s любит меня", name);
            System.out.println(sf);
        }
    }
}
