package Basics;

public class SwitchCash {
    public static void main(String[] args) {
        char ch = 'A';
        switch(ch){
            case 'A' : 
            case 'E' :
            case 'I' :
            case 'o' :
            case 'U' : System.out.println("Vowel");break;
            default: System.out.println("may be Consonent");
        }
    }
}
