import java.util.*;

public class p1_varargs {
    static void name(String ... name){
        for( String n : name){
            System.out.println(n);
        }
    }
    static void main(String[] args) {

       name("ayush","trisha");
       name();
       name("ayush", "trisha", "raju");
    }
}
