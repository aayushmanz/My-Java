
import java.util.*;


public class string_method_learn {
    public static void main(String[] ayush){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string name : ");
        String a = sc.nextLine();
        System.out.println(a);

        int size = a.length();
        System.out.println("the Size of this string is : "+size);

        String Lstring = a.toLowerCase().trim();
        System.out.println(Lstring);

        String Ustring = a.toUpperCase().trim();
        System.out.println(Ustring);

        System.out.println(a.substring(7));
        System.out.println(a.substring(8, 16));






    }
}
