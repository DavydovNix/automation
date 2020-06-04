package programming2.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arr1 {
   /*Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива*/

    public static void main(String[] args) throws IOException {
        int[] array = initializeArray();
        max(array);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input element N: " + i);
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static void max(int[] array) {
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
            }
        }
        System.out.println();
        System.out.println("max array element = " + maxElement);
    }
}
