
import java.util.*;
import java.io.*;

class ayush implements Runnable{
    public void run(){
        System.out.println("Ayush ka thread " );
    }
    public  ayush(String name){
        System.out.println("My name is : " + name);
    }
}

public class p3_thread {
     public static void main(String[] args) {
        ayush ayu = new ayush("ayush");
        Thread t1 = new Thread(ayu, "ayush the hero");

        t1.start();
        t1.getName();

     }
}
