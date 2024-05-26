package Patterns;

public class Star2 {
    public static void main(String[] args) {
         
        for(int i = 0 ; i<5;i++){
            for(int j = 0 ; j<= i ;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(" *  *  *  *  *  * ");
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 5 ; j>i ; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println("Squre PATTERNS");
        for(int i = 1 ; i<=4 ; i++){
            for(int j = 1 ; j <= 4 ; j++){
                if(i==1 || i==4 || j==1 || j==3){
                System.out.print(" * ");
                }else{
                   System.out.print("      ");
                }
            }
            System.out.println();
        }
    }

}
