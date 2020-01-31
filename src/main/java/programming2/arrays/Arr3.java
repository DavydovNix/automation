package programming2.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*2 массива
  1. Создать массив на 10 строк.
  2. Создать массив на 10 чисел.
  3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
  4. В каждую ячейку массива чисел записать длину строки из массива строк,
  индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
  5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.*/
public class Arr3 {
    public static void main(String[] args) throws IOException {
        String[] lines = new String[10];
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < lines.length; i++) {
            lines[i] = reader.readLine();
            numbers[i] = lines[i].length();
        }
        for (int element:numbers) {
            System.out.println(element);
        }
    }
}
