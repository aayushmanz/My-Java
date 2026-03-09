import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class checking {

    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n ; i++){
            int e = sc.nextInt();
            ArrayList<Integer>innerlist = new ArrayList<>();
            for(int j = 0; j < e; j++){
                int value = sc.nextInt();
                innerlist.add(value);
            }
            list.add(innerlist);
        }

        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int first = sc.nextInt();
            int element = sc.nextInt();
            try{
                System.out.println(list.get(first-1).get(element-1));
            } catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
