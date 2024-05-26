package Patterns;
public class Star {
    public static void main(String[] args) {
       System.out.println(cubeOf(2, 3));
    }
    public static int cubeOf(int m , int n){
        if (m>n) {
            return 0 ;
        }
         int totalSum = 0 ;
        for(int i = m ; i <= n ; i++){
             totalSum += Math.pow(i, 3);
        }
        return totalSum;
    }
}
