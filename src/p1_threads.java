

class mythread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("My thread (1) is running !");
            i++;
        }
    }
}

class mythread2 extends Thread{
    public void run (){
        int i = 0;
        while(i < 100){
            System.out.println("My thread (2) is running !");
            i++;
        }
    }
}
public class p1_threads {
    public static void main(String[] args) {

        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();

        t1.start();
        t2.start();
    }
}
