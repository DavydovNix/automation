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
    public static final int ARRAY_LENGTH = 20;
    public static void main(String[] args) throws IOException {
        int[] array = initializeArray();
        max(array);
    }
    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        return array;
    }
    public static void max(int[] array){
        int maxElement = array[0];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (maxElement < array[i]){
                maxElement = array[i];
            }
        }
        System.out.println();
        System.out.println("max element = " + maxElement);
    }
}
