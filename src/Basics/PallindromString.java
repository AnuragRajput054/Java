package Basics;

import Patterns.star4;

public class PallindromString {
    public static void main(String[] args) {
          String str = "aba";
          String str2 = "aba";
          String name = new String("Anurag");
          String name2 = new String("Anurag");
          System.out.println(name==name2);
          System.out.println(name.equals(name2));
          System.out.println(str==str2);
          System.out.println(str.equals(str2));
          int start = 0 ;
          int end = str.length()-1;
          boolean flag = true;
        //  System.out.println(end);
        while(start<=end){
          
              if(str.charAt(start)!=str.charAt(end)){
                flag = false;
                break;
              }
              start++;
              end--;
        }
        if(flag){
            System.out.println("Pallindrom String");
        }else{
            System.out.println("Not A Pallindrom String");
        }

    }

}
