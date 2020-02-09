package programming2.typeConversion;
/*
* В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат
* деления q на w с остатком. Пример вывода программы
* (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке*/
public class Ex1 {
    public static void main(String[] args) {
        int q = 31,w = 8;
        if(q%w!=0)
            System.out.println(q+"/"+w+" = "+q/w+" и "+q%w+" в остатке");
        else System.out.println(q/w);
    }
}
