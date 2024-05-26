package Basics;
public class FirstArrays {
    public static void main(String[] args) {
        int[] nums = {
            10,20,30,40,50,60,70,80,90
        };
    
    binarySearch(nums, 70);
        
    }

    // Binary Search
    public static void binarySearch(int[] nums , int n ){
        int start = 0 ;
        boolean k = false;
        int end = nums.length-1;
        while (start  <= end) {
            int mid = (start + end)/2;
            if(nums[mid] == n){
                 k = true;
                 break;
            }else if(n>nums[mid]){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        if(k){
            System.out.println("Given Number is Found");

        }else{
            System.out.println("Not Fount");
        }
    }
}
