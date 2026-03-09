import java.sql.SQLOutput;
import java.util.Scanner;


public class p6_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int even_count = 0;
        int odd_count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2==0){
                even_count++;
                System.out.format("This arr[%d] is even\n",arr[i]);
                System.out.println("total number of even are : " + even_count);
            }
            else{
                odd_count++;
                System.out.printf("This arr[%d] is odd\n", arr[i]);
                System.out.println("Total number of odd is : " + odd_count);
            }
        }

        System.out.println("total even is : " + even_count);
        System.out.println("total odd is : " + odd_count);
    }
}
