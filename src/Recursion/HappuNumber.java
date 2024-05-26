package Recursion;

public class HappuNumber {
       public static void main(String[] args) {
            System.out.println(helper(19));
       }


       public static boolean helper(int nums){
        if(nums< 10){
             if(nums==1 || nums ==7){
                 return true;
             }else  return false;
            
        }
        int ans  = 0 ;
        int rem = 0 ;
        while(nums>0){
            rem = nums%10;
            ans =  ans +  (rem * rem);
            nums = nums/10;
       }
         return helper(ans);
       }
}
