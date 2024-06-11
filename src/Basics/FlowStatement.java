package Basics;

public class FlowStatement {
    public static void main(String[] args) {
      System.out.println(strStr("leetcode", "leet"));
    }


    
      public  static int strStr(String haystack, String needle) {
          int length = needle.length()-1;
        for(int i = 0 ; i < haystack.length();i++){
              if(haystack.substring(i) == needle){
                  return i;
              }
             
          }
         return -1;
      }
  }
    

