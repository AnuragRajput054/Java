package BackTracking;

import java.util.ArrayList;

public class StringParmutation {
    public static void main(String[] args) {
        
       System.out.println(stringPer("ABC", 0, ""));
        
    }

    static ArrayList<String> stringPer(String str , int index , String parm ){

        ArrayList<String> cars = new ArrayList<String>();
        if(str.length()==0){
          //  System.out.println(parm);
            cars.add(parm);
    
        }
        for(int i =0 ; i< str.length();i++){

            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            stringPer(newStr, index, currChar+parm);
        }
        return cars;
    }
}
