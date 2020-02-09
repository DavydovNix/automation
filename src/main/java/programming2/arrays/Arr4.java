package programming2.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Массив из чисел в обратном порядке
        1. Создать массив на 10 чисел.
        2. Ввести с клавиатуры 10 чисел и записать их в массив.
        3. Расположить элементы массива в обратном порядке.
        4. Вывести результат на экран, каждое значение выводить с новой строки.*/
public class Arr4 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = array.length-1; i >= 0; i--) {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        int buff;
        for (int i : array) {
            System.out.println(i);
        }

    }
}
