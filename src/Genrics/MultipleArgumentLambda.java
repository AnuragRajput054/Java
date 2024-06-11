package Genrics;

/**
 * A
 */  

 interface A {
  
     int sum(int a ,int b);
    
}
public class MultipleArgumentLambda {
       public static void main(String[] args) {
        
        A obj1 = (a, b ) -> (a+b);
        System.out.println(obj1.sum(5,2));
       }
}
