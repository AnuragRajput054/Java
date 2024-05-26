package Basics;

public class TernaryOperators {
    public static void main(String[] args) {
        System.out.println("hello");
        int a = 10 ,  b = 20 , c = 30 ;
        c = (a>b)?(a>c)?a:c : (b>c)?b:c; 
        System.out.println(c);
    }
}
