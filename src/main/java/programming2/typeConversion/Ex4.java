package programming2.typeConversion;

import java.util.Random;

public class Ex4 {
    /*Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось значение a+b,
   в b хранилась разность старых значений c−a,
   а в c хранилось сумма старых значений a+b+c. Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.*/
    public static void main(String[] args) {
        Random rnd = new Random();
        int a = rnd.nextInt((5) + 2);
        int b = rnd.nextInt((5) + 2);
        int c = rnd.nextInt((5) + 2);
        //System.out.println("initial values: a = " + a + " b = " + b + " c = " + c);
        System.out.printf("initial values: %s = %d, %s = %d, %s = %d ", "a", a, "b", b, "c", c);
        a += b;
        b = c - (a - b);
        c += a;
        //System.out.println("final values: a = " + a + " b = " + b + " c = " + c);
        System.out.printf("\nfinal values: %s = %d, %s = %d, %s = %d ", "a", a, "b", b, "c", c);
    }
}
