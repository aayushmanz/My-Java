import java.util.*;

public class p7_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the searching element : ");
        int search = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(arr[i] == search){
                System.out.println("Yes this element is exist !!!");
                System.out.println("your searched element is " + arr[i]);

                break;
            }

        }
    }
}
