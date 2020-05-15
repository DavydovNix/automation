package programming2.primitive_types2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {
    /*Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Hello, world!”.
       Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя, считывать введенное имя
       с консоли и выводить на экран приветствие “Hello, %name%”.*/
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, world!");
        printHelloName();
    }
    public static void printHelloName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input name:");
        String name = reader.readLine();
        System.out.println("Hello, "+name);
    }
}
