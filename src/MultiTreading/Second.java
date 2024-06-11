package MultiTreading;

public class Second {
   public static void main(String[] args) {
    MyThread obj1 = new MyThread();
    //System.out.println();

    try{
        for(int i = 1 ; i<=5 ; i++){
             System.out.println("Anu  "  +i);
             Thread.sleep(1000);
             
        }
    }
    catch(InterruptedException e ){
        System.out.println(e);
    }
    System.out.println("Main Tread Exit");
   }
    

    
}

class MyThread implements Runnable{
     Thread t1 ;
     MyThread() {
        t1 = new Thread(this);
        t1.setPriority(10);
        t1.start();
     }
     public void run(){
        try{
            for(int i = 1 ; i<=5 ; i++){
                 System.out.println("Raj  "  +i);
                 t1.sleep(1000);
                
            }
        }
        catch(InterruptedException e ){
            System.out.println(e);
        }
        System.out.println("My Thread is Exits");
     }
}
