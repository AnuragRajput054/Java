package MultiTreading;

public class FirstMultiTreat {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
     //   System.out.println(t1);
        t1.setName("MyTread");
        t1.setPriority(8);
        System.out.println(t1);
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1);
        System.out.println(t1.isAlive());
        try{
             for(int i = 1 ; i <=5 ; i++){
                System.out.println(i);
                t1.sleep(1000);
             }
        }
        catch(InterruptedException e ){
            System.out.println(e);
        }
        System.out.println("bye");
    }
}
