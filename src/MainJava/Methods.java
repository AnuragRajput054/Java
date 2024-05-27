package MainJava;

public class Methods {

    int a , b, c ;
    public static void main(String[] args) {
          
        Methods m1 = new Methods();
        Methods m2 = new Methods();
        m1.a = 10;
        m2.a = 100;
        m1.b = 20;
        m2.b = 200;
        m1.show();
        m2.show();
        m1.show(30,40);

    }
       // No Argument Methods
          void show(){
           System.out.println(a+"  "+b);
    }
   // Parametrise Method
    void show(int a , int b){
            System.out.println(a+" "+b);
    }
}
