import java.util.Scanner;

public class p3_array {
    public static void m(String args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i = 0; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Maximum : " + max);

    }
}
