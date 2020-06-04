package programming2.primitive_types2.com.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {
    private String name;

    public void setupName() throws IOException {
        System.out.println("Input name");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        name = reader.readLine();
    }

    public void welcome() {
        System.out.println("Hello, " + name);
    }

    public void byeBay() {
        System.out.println("Bye, " + name);
    }
}
