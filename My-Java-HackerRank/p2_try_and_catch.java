import java.io.*;

public class p2_try_and_catch {
    public static void main(String[] ayush) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the number of elements: ");
            int a = Integer.parseInt(br.readLine());
            int[] arr = new int[a];

            System.out.println("Enter the values in elements: ");
            for (int i = 0; i < a; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            System.out.print("Enter the index you want to divide: ");
            int b = Integer.parseInt(br.readLine());

            System.out.print("Enter the number you want to divide by: ");
            int div = Integer.parseInt(br.readLine());

            arr[b] = arr[b] / div;

            System.out.println("Result after division: " + arr[b]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred!");
            System.out.println("Reason: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong index! Please try again.");
            System.out.println("Reason: " + e);
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        }
    }
}
