import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class myExceptions extends Exception{
    @Override
    public String toString(){

        return super.toString() + " this is TOString";
    }

    public String getMessage(){

        return super.getMessage() + "this is get Message";
     }
}
public class p1_exception_methods  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int a;
           a = Integer.parseInt(br.readLine());
         try {
             if (a < 9) {
                 throw new myExceptions();
             }
         } catch (Exception e) {
             System.out.println(e.getMessage());
             System.out.println(e.toString());
             System.out.println(e);
             e.printStackTrace();

         }

    }
}
