package MainJava.Keywords;

public class Abstract {
      public static void main(String[] args) {
        Boi b1 = new Boi();
        b1.intrest();
      }
}

abstract class RBI {
       abstract void intrest();
        
        
       
}

class Boi extends RBI{
    void intrest(){
        System.out.println("In Our Bank There is 7 percent intrest is taken");
    }
}
