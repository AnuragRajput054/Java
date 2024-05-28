package Polymorphism;

public class Overrinding {
public static void main(String[] args) {
    B b1 = new B();
    A a1 = new A();
    a1.show();
    b1.show();
}
}

class A {
    void show(){
        System.out.println("hello Jii");
    }
}

class B extends A {
     void show(){
        System.out.println("kese ho ");
     }
}
