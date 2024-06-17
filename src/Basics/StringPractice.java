package Basics;

public class StringPractice {
    public static void main(String[] args) {
        String str = "aaabbbeccczdd";
        for(int i = 0 ; i <str.length();i++){
            boolean flagBit = false;
            for(int j = 0 ; j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)&& i != j){
                    flagBit = true;
                    break;
                }
                
            }

          if(!flagBit){
            System.out.println(str.charAt(i));
            break;
          }
        
        }
        

    }
}
