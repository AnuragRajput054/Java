package BackTracking;
import java.util.Arrays;

public class AllPair {
    public static void main(String[] args) {
        boolean[][] board = {
            {true , true, true},
            {true , true , true},
            {true , true, true},
          };
          int[][] nums = {
            {0,0,0},
            {0,0,0},
            {0,0,0},
          };
            allPair("", board, 0, 0 , nums,1);
    }
     // With pair with path matrix
    static void allPair(String str , boolean[][] maze , int r , int c ,int[][] nums , int step ){
        if(r== maze.length-1 && c== maze[0].length-1){
                  nums[r][c] = step;
                for(int[] arr : nums){
                      System.out.println(Arrays.toString(arr));
                }
                System.out.println(str);
                System.out.println();

            return;
        }
        if(!maze[r][c]){
            return;
        }
       maze[r][c]= false;
       nums[r][c] = step;
        if(r<maze.length-1){
            allPair(str+'D', maze, r+1, c ,nums , step+1);
        }
        if(c<maze[0].length-1){
            allPair(str+'R', maze, r, c+1,nums, step+1);
        }
        if(r>0){
            allPair(str+'U', maze, r-1, c,nums , step+1);
        }
        if(c>0) {
            allPair(str+'L', maze, r, c-1 ,nums , step+1);
        }
        maze[r][c] = true;
        nums[r][c] = 0;
    }
}
