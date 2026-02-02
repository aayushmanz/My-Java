import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Raju implements Runnable {

    @Override
    public void run() {
        // Thread jo actual name use karega
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many time u want ot execute this : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Thread is running... Name: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class p3_mutli_threading_methods {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name here : ");
        String name = br.readLine();

        Raju r1 = new Raju();

        Thread t1 = new Thread(r1);   // Runnable ko assign kiya
        t1.setName(name);             // ab thread ka name set kiya

        t1.start();                   // Thread shuru

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // print thread name
        System.out.println("Final Thread Name: " + t1.getName());
    }
}
