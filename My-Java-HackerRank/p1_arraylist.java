import java.util.ArrayList;
import java.util.Scanner;

public class p1_arraylist {

    static void add(ArrayList<Integer> ayush){
        int sum = 0;
        for(int a : ayush) {
            sum+=a;
        }
        System.out.println(sum);
    }

  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      System.out.println("Enter for number of elements : ");
      int num = sc.nextInt();
      ArrayList <Integer> ayush = new ArrayList<>();

      for (int i = 0; i < num; i++){
          System.out.println("Enter the element : ");
          int n = sc.nextInt();
          ayush.add(n);
      }


      add(ayush);
    }
}
