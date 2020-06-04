package programming2.Conditions;

public class Ex11 {
    //Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в каждой строке не разделять.
    public static void main(String[] args) {
        int i = 0;
        while (i<10){
            int j = 0;
            while (j<10){
                System.out.print("s");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
