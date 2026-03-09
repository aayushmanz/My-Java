import java.util.*;

public class p1_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here : ");
        int n = sc.nextInt();
        int sum = 0;

        sc.next();
        for(int i = 0; i < n; i++){

            int num = sc.nextInt();
            sum += num;
        }

        System.out.println("The total sum is : " + sum);
    }
}
