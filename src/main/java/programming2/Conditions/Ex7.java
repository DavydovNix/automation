package programming2.Conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ex7 {
    /*За семь попыток угадать число. При каждой попытке вам будет выводиться сообщение - "Мало" или "Много".
    Если угадаете, уложившись в семь попыток, то выводится сообщение "Угадал :)" и программа завершает работу.
    Если по истечении 7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа.*/
    public static void main(String[] args) throws IOException {
        int secretNumber;
        int myNum = 0;
        int countTries = 0;
        Random rnd = new Random();
        secretNumber = rnd.nextInt(10) + 10;
        System.out.println(secretNumber);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (myNum != secretNumber && countTries != 7) {
            countTries++;
            myNum = Integer.parseInt(reader.readLine());
            if (myNum > secretNumber)
                System.out.println("Много");
            else if (myNum < secretNumber)
                System.out.println("Мало");
            else
                System.out.println("Угадал :)");
            if (countTries == 7) System.out.println("Не угадал :(");
        }
    }
}
