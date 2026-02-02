import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1_stringcoversion {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        boolean isNumber = true;
        if(a.equals(b)){
            throw new Exception("java.util.InputMismatchException");
        }

        for (int i = 0; i < a.length(); i++) {
            if (!Character.isDigit(a.charAt(i))) {
                isNumber = false;
                break;
            }
        }


        for (int i = 0; i < b.length(); i++) {
            if (!Character.isDigit(b.charAt(i))) {
                isNumber = false;
                break;
            }
        }

        try {

            if (isNumber) {

                int a1 = Integer.parseInt(a);
                int b1 = Integer.parseInt(b);
                if(a1 == b1){
                    System.out.println("java.util.InputMismatchException");
                }
                else{
                    int c = a1 / b1;
                    System.out.println(c);
                }

            } else {
                System.out.println("java.util.InputMismatchException");
            }

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
