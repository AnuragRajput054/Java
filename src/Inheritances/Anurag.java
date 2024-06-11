package Inheritances;

public class Anurag {
    public static void main(String[] args) {
       B obj1 = new B(); 
       System.out.println(obj1.getClass());
       obj1.show();

    }
}

class A {
      A(){
        System.out.println("Hello From A ");
      }
    
    }

 class B extends A {
      
    B(){
        System.out.println("Hello From B");
         
    }
      void show(){
            System.out.println("Hello");
      }


    
}