package Inheritances;

 class Parent {
    void show(){
        System.out.println("Hello:This is a Parent Class");
    }
 }

 class A {
    void show2(){
        System.out.println("Ambiguity");
    }
 }
 class Child extends Parent {
   void display(){
       System.out.println("Hello:This is a Child class");
   } 
}



/**
 * InnerSingleLevel
 */
 class InnerSingleLevel  extends Child {
   
    void Print(){
        System.out.println("Hello: this is Sub-Child Class");
    }
    
}

/**
 * InnerSingleLevel_1
 */
 class InnerSingleLevel_1  extends Parent{
   void out(){
      System.out.println("Hello : this is Hirrarical Inherutance");
   }
    
}
public class SingleLevel {
    public static void main(String[] args) {
        Child obj1 = new Child();
        Parent obj2 = new Parent();
        InnerSingleLevel obj3 = new InnerSingleLevel();
        InnerSingleLevel_1 obj4 = new InnerSingleLevel_1();
        obj4.show();
        obj2.show();
        obj1.show();
        obj1.display();
        obj3.show();
        obj3.Print();
        obj3.display();
        
        
    }
}
