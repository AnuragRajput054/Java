package MainJava.Constructor;
//import MainJava.Constructor.ZeroArgumentConstructor;

public class CopyConstructor {
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

     public static void main(String[] args) {
        
        CopyConstructor obj1 = new CopyConstructor(10, 20, 30);
        CopyConstructor obj2 = new CopyConstructor(obj1);
        obj1.show();
        obj2.show();
        CopyConstructor obj3 = new CopyConstructor(obj2);
        obj3.show();
        ZeroArgumentConstructor obj6 = new ZeroArgumentConstructor();
        obj6.first();
    
        System.out.println(obj2.d);
   
    

        
    }

    CopyConstructor(CopyConstructor obj1){
        d = 20;
        a  =  obj1.a ;
        b  =  obj1.b;
        c  =  obj1.c;
    }
}
