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
        int[] mainArray = new int[6];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mainArray.length; i++) {
            String s = reader.readLine();
            mainArray[i] = Integer.parseInt(s);
        }
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        System.arraycopy(mainArray,0,array1,0,array1.length);
        System.arraycopy(mainArray,mainArray.length/2,array2,0,array2.length);
        for (int element:array2) {
            System.out.println(element);
        }
    }
}
