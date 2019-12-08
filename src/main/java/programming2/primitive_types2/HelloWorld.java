package programming2.primitive_types2;

import java.util.Scanner;

public class HelloWorld {
    /*Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Hello, world!”.
       Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя, считывать введенное имя
       с консоли и выводить на экран приветствие “Hello, %name%”.*/
    public static void main(String[] args) {
        System.out.println("Input your name");
        printHelloName();
    }
    public static void printHelloName(){
        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Hello, "+name+".");

    }
}
