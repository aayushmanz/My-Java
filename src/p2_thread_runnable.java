

class mythread_runnable1 implements Runnable{
   public  void run(){
       int i = 0;
        while( i < 100){
            System.out.println("The runnable (1)");
            i++;
       }
    }
}

class mythread_runnable2 implements Runnable{
    public void run(){
        int i = 0;
        while( i < 100){
            System.out.println("The runnable (2)");
            i++;
        }
    }
}


public class p2_thread_runnable {
   public static void main(String[] args){
        mythread_runnable1 bullet1 = new mythread_runnable1();
        Thread gun1 = new Thread(bullet1);
        mythread_runnable2 bullet2 = new mythread_runnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

        
    }
}
