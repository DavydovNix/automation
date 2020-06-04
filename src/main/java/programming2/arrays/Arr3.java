package programming2.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arr3 {
    /*2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.*/
    public static void main(String[] args) throws IOException {
        String[] string_array = new String[10];
        int[] int_array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < string_array.length; i++) {
            System.out.println("Input " + (i + 1) + " line");
            string_array[i] = reader.readLine();
            int_array[i] = string_array[i].length();
        }
        for (int element : int_array) {
            System.out.println(element);
        }
    }
}
