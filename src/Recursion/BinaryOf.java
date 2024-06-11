package Recursion;

import java.util.ArrayList;
import java.util.List;

public class BinaryOf {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        bin(10);
        int x =10 ;
        System.out.println(Integer.toBinaryString(100));
    }

    public static void bin(int n){
    //    ArrayList list = new ArrayList<>();
        int r ;
        if(n>0){
            r = n%2;
            bin(n/2);
            System.out.println(r);
           // list.add(r);
        }
       // System.out.println(list);
    }
}
