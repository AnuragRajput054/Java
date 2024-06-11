package Genrics;

import java.util.ArrayList;

 class LamdaExpresion {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
              list.add(i+1);
        }
         list.forEach((i) -> System.out.println(i * i));

         Sum sum = (a,b) -> a+b;
         System.out.println(sum);

}
     
}


public interface Sum  {
   
    int sum(int a ,int b);
    
}
