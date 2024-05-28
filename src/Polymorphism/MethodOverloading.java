package Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading obj1 = new MethodOverloading();
        obj1.show();
        obj1.show("Hello : This is methode Overloading");
        obj1.show(2,3);
    }

     void show(){
        System.out.println("Hello ji");
     }
     void show(int x , int y){
        System.out.println(x+" "+y);
     }

     void show(String str){
        System.out.println(str);
     }

}
