package programming2.Conditions;

public class Ex13 {
    // Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
    //Через пробел либо с новой строки.
    public static void main(String[] args) {
        for (int i = 0; i < 101; i += 2) {
            System.out.print(String.format("%4d", i));
        }
    }
}
