package programming2.Conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14 {
<<<<<<< Updated upstream
    /*Ввести с клавиатуры два числа m и n. Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
    Пример: m=2, n=4
            8888
            8888*/
=======
    /*Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888*/
>>>>>>> Stashed changes
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
<<<<<<< Updated upstream
=======
            //System.out.println(8);
>>>>>>> Stashed changes
            for (int j = 0; j < n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
