package programming2.typeConversion;

public class Ex3 {
        /*В переменной n хранится вещественное число с ненулевой дробной частью.
    Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.*/

    public static void rounding() {
        double n = Math.random();
        System.out.println("n = " + n + " " + "round n = " + Math.round(n));
    }

    public static void main(String[] args) {
        rounding();
    }
}
