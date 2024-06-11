package Interfaces;

class First {
    public static void main(String[] args) {
                 C obj1 = new C();
                 obj1.show();
                 obj1.display(); 
                 obj1.add();       
    }
}
 interface A {

    void show();
    void display();
}

 interface B {
     void show();
     void display();    
}
class D {
    void add(){
        System.out.println("hellO From add");
    }
}
class C  extends D implements A , B  {
 
   public void show(){
    System.out.println("Hello From Show");      
 }  
 
    public void display(){
        System.out.println("Hello From Display");
    }
} 