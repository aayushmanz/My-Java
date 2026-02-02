import com.sun.security.jgss.InquireType;

import java.util.*;
import java.io.*;

public class p3_CustomException {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        while(true) {
            try {

                int c = a / b;
                System.out.println(c);

            } catch (ArithmeticException e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println(" The code is now over ");
                System.out.println("The value of B is : " + b);
            }
            b--;
        }
    }
}
