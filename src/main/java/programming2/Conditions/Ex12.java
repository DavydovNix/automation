package programming2.Conditions;

public class Ex12 {
    //Вывести на экран таблицу умножения 10х10 используя цикл while.
    //Числа разделить пробелом.
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 0;
            while (j < 10) {
                j++;
                //System.out.print(i*j+" ");
                System.out.print(String.format("%4d", i * j));
            }
            System.out.println();
            i++;
        }
    }

}
