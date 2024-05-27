package MainJava.Keywords;

public class StaticBlock {
    static int a = 10 ; 
    static{
        a =  a * 5 ;
        System.out.println(a);
    }
    
    static void show(){
        
        System.out.println(a+5);
    }

    public static void main(String[] args) {
         
        System.out.println("Helo");
        System.out.println(a);
        StaticBlock.show();
        System.out.println(a);
    }
}
