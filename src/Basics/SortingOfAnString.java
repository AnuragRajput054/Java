package Basics;

/**
 * SortingOfAnString
 */
public class SortingOfAnString {

    public static void main(String[] args) {
        
        String[] str = {"Indore","Bhopal","India"};
        String temp ;
        for(int i = 0 ; i < str.length-1;i++){
            for(int j = i+1 ; j < str.length;j++){
                if(str[i].compareTo(str[j])>0){
                        temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                }
            }

        }
        for (String string : str) {
            System.out.println(string);
        }
    }
}