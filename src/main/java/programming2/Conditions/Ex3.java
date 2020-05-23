package programming2.Conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex3 {
    //Ввести с клавиатуры три числа, и вывести их в порядке убывания.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
