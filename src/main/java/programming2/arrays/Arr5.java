package programming2.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/
public class Arr5 {
    public static void main(String[] args) throws IOException {
        int[] big_array = new int[20];
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        for (int i = 0; i < big_array.length; i++) {
            big_array[i] = Integer.parseInt(reader.readLine());
        }
        int[] small_array1 = new int[10];
        int[] small_array2 = new int[10];
        System.arraycopy(big_array,0,small_array1,0,small_array1.length);
        System.arraycopy(big_array,big_array.length/2,small_array2,0,small_array2.length);
        System.out.println("Second small array:");
        for (int i = 0; i < small_array2.length; i++) {
            System.out.println(small_array2[i]);
        }
    }
}
