package MainJava.Keywords;

public class StaticKeywords {
    
    static int a = 10 ;  // This is Static Variable = If A Variable is deacleare as  a Static then it will teated as Class Variable rather then a instance Variable. Memory allocation for the Static variable for all the object is same that mean all objects share the comman memory in the System.
    public static void main(String[] args) {
     //   StaticKeywords obj1 = new StaticKeywords();
     //   StaticKeywords obj2 = new StaticKeywords();
      //  obj1.a = 20 ;
      //  obj2.a = 30 ;
      //  a = 50 ;
        System.out.println(StaticKeywords.a);
   //     System.out.println(obj1.a);
        StaticKeywords.show();
        show();
    }

    public static void show(){
        System.out.println("Hello: This is a Static Methode "+a);
    }
}
