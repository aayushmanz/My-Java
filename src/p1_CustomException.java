
import java.util.*;
import java.io.*;

class ayush_ki_exception extends Exception{
    @Override
    public String toString(){
        return super.toString() + " Bhai bas kar chup chaap sahi value daal le ";
    }
    @Override
    public String getMessage(){
        return super.getMessage() + " Enter the correct value on it" ;
    }
}

public class p1_CustomException {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number 1 : ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter the number 2 : ");
        int  b = Integer.parseInt(br.readLine());

        if(a < b){
            try{
                throw new ayush_ki_exception();
            } catch (ayush_ki_exception e) {

                System.out.println(e.toString());

            }
        }else{
            int c = a / b;

            System.out.println("The division is : " + c);

        }

    }
}
