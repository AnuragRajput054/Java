package MainJava.Constructor;
//import MainJava.Constructor.ZeroArgumentConstructor;

public class CopyConstructor implements Cloneable {
    int a , b ,c ;
    final int d ;
     CopyConstructor(int a , int b , int c ){
        d = 50;
        this.a = a ;
        this.b  = b ; 
        this.c = c ;
        
     }

     void show(){
         System.out.println(a+" "+b+" "+c);
         
     }

     /**
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        
        CopyConstructor obj1 = new CopyConstructor(10, 20, 30);  // Normal object creation
        CopyConstructor obj2 = new CopyConstructor(obj1);       // copy constructor
        CopyConstructor obj3 = new CopyConstructor(obj2);         // ""
        ZeroArgumentConstructor obj6 = new ZeroArgumentConstructor();   // No Argument Constructor

        CopyConstructor obj = (CopyConstructor)obj1.clone(); // clone an object by using Clonable Interface 
        obj1.show();
        obj2.show();
        obj3.show();
        obj6.first();
        System.out.println(obj2.d);
        System.out.println("Anurag  "+obj.a+" "+obj.b);

   
    

        
    }

    CopyConstructor(CopyConstructor obj1){
        d = 20;
        a  =  obj1.a ;
        b  =  obj1.b;
        c  =  obj1.c;
    }
}
