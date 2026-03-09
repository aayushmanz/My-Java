import java.util.ArrayList;
import java.util.Scanner;

public class p2_arraylist {
    static void find(ArrayList<Integer> value){
        for(int v : value){
            if(v % 2 == 0){
                System.out.printf("The %d is : even \n " , v);
            }
            else{
                System.out.printf("The %d is : odd \n " , v);
            }
        }
    }
    static void main(String[] args) {
        ArrayList<Integer> value = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of element : ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            System.out.println("Enter elements : ");
            int n = sc.nextInt();

            value.add(n);
        }

        find(value);
    }
}
