package Genrics;

import java.util.ArrayList;

public class FirstGeneric {
    public static void main(String[] args) {
     
        Gen<Integer , String> obj2 = new Gen(10,"Jai Shree Ram");   // Genric class
         Gen<String , Integer> obj1 = new Gen("Hello",10);
         ArrayList<String> obj3 = new ArrayList<String>();
         ArrayList list  = new ArrayList<>();    //Normal Collection FrameWork
         
         obj1.show();
         obj2.show();
         obj3.add("Hello");
         obj3.add("Indore");
         obj3.add("India");
         list.add("Indore");
         list.add(10);
       //  System.out.println(list);
       //  System.out.println(obj3);
         
         
    }
}

class Gen<T , W>{

       T a1 ; 
       W a2 ;
        Gen(T temp , W temp2){
            a1 = temp;
            a2 = temp2;
        }
       
        void show(){
            System.out.println(a1+"  "+a2+" "+a1.getClass());
        }
}
