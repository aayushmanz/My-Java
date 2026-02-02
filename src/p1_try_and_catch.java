import java.util.*;
import java.io.*;

public class p1_try_and_catch {
    static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the number1 : ");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Enter the second number : ");
            int b = Integer.parseInt(br.readLine());

            int c = a / b;
            System.out.println("The Division of a + b is : "+ c);
        } catch (Exception ayu) {
            System.out.println("We are failed to provide the Solution.");
            System.out.println("The reason is : " + ayu);
        }

    }

}
