package MainJava;

public class Singleton {
    public  String str ;
    private static Singleton instance = null;
     
     private Singleton(){
         str = "Hello: This is the Singleton Class";
     }
     public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
     }
}
