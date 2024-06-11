package MultiTreading;

public class Third {

    public static void main(String[] args) {
        
         MyThread obj1 = new MyThread("One");
         MyThread obj2 = new MyThread("Two");
         try{
              for(int i = 0 ; i < 3 ; i++){
                System.out.println("MAin "+ i);
                Thread.sleep(1000);
              }
         }
         catch(InterruptedException e){
            System.out.println(e);
         }
         System.out.println(  " main  Exit");
         


    }
    
}


 class MyThread implements Runnable  {
      
      Thread t ;
     String name ;
     MyThread(String threadName){
        name = threadName;
        t = new Thread(this,name);
        System.out.println(t);
        t.start();
     }

    public void run(){
     try{
          for(int i = 0 ; i < 3 ; i++){
              System.out.println(name +" "+i);
              t.sleep(1000);
          }
     }
     catch(InterruptedException e){
        System.out.println(e);
     }
     System.out.println(name + " Exit");
    }
}
     
     


    
