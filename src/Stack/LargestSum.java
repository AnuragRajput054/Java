package Stack;

import java.util.Arrays;
public class LargestSum {
    public static void main(String[] args) {
        int[] nums = {2,4};
        System.out.println(maxsum(nums));
    }

    public static int maxsum(int[] nums){

     int sum = 0 , maxSum = 0 ;
     Arrays.sort(nums);
     for(int i = 0 ; i < nums.length ; i++){
           sum = findsum(i,nums);
           if(sum>=maxSum){
            maxSum = sum;
           }
     }
        return maxSum;
    }

    public static int findsum(int i , int[] nums){
        int sum = 0 ;
        for (int j = i; j < nums.length; j++) {
             sum += nums[i];
        }

        return sum;
    }
}
