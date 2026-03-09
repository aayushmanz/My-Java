
import java.util.*;
import java.io.*;

class ayush_ka_exception extends Exception{
    public String toString(){
        return "Bro can u Enter the greater than 0 value ";
    }

    public String getMessage(){
        return "Bro Enter the greater value here !";
    }
}
class calculate {
    public double area(double radius){
        return Math.PI * radius * radius;
    }
}
public class p2_CustomException {
    public static void main(String[] args) throws IOException{
        calculate c = new calculate();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the radius of the circle : ");
        double r = Double.parseDouble(br.readLine());
        if(r < 0) {
            try {
                throw  new ayush_ka_exception();
            }
            catch (ayush_ka_exception e){
                System.out.println(e.getMessage());

            }
        }
        else{
            System.out.println("The area of circle is : "+c.area(r));
        }


    }
}
