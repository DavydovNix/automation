package programming2.typeConversion;

public class Ex2 {
    /*В переменной n хранится натуральное двузначное число. Создайте программу,
    вычисляющую и выводящую на экран сумму цифр числа n.*/
    public static int n = 99;
    public static void summNumbers(){
        int digit, summ = 0;
        while (n>0){
            digit = n%10;
            summ+=digit;
            n/=10;
        }
        System.out.println(summ);
    }
    public static void main(String[] args) {
        summNumbers();

    }
}
