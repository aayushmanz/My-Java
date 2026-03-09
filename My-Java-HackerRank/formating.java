import java.util.*;
import java.io.*;

public class formating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream p = System.out;



        System.out.println("================================");
        for (int i = 0; i < 3; i++ ){
            String s = sc.next();
            int n = sc.nextInt();

            p.printf("%-15s%03d%n", s , n);
        }
        System.out.println("================================");

    }
}
