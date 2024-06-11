package ExceptionHandling;

import java.util.Scanner;

public class UserDefineException  extends Exception{
    
     String message ;
     UserDefineException(String str){
        message = str;
     }
     public String toString(){
        return message;
     }
}

/**
 *  Test 
 */
class  Test  {
  public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello User : Tell Me Your age");    
       int age = sc.nextInt() ; 
       try{
           if(age<18){
            throw new UserDefineException("Your are not applicable for vote");
           }
           else{
              System.out.println("Your are Applicable for vote");
           }
       }
       catch(UserDefineException e){
           System.out.println(e);
       }
       System.out.println("Bye");
  }
    
}
