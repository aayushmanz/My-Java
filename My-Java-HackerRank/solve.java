import java.io.*;

class CalculationTask implements Runnable {
    private int num;

    public CalculationTask(int num) {
        this.num = num;
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " started calculation...");

            if (num == 0) {
                throw new ArithmeticException("Number cannot be zero!");
            }

            int result = 100 / num;
            System.out.println(Thread.currentThread().getName() + " result: " + result);

        } catch (ArithmeticException e) {
            System.out.println(Thread.currentThread().getName() + " error: " + e.getMessage());
        } finally {
            System.out.println(Thread.currentThread().getName() + " finished calculation.\n");
        }
    }
}

class FileTask implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " reading a file...");
            BufferedReader br = new BufferedReader(new FileReader("example.txt"));
            String line = br.readLine();
            System.out.println(Thread.currentThread().getName() + " read line: " + line);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(Thread.currentThread().getName() + " error: File not found!");
        } catch (IOException e) {
            System.out.println(Thread.currentThread().getName() + " error: I/O problem occurred!");
        } finally {
            System.out.println(Thread.currentThread().getName() + " file reading complete.\n");
        }
    }
}

public class solve {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CalculationTask(5), "Thread-1");
        Thread t2 = new Thread(new CalculationTask(0), "Thread-2"); // will throw exception
        Thread t3 = new Thread(new FileTask(), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
