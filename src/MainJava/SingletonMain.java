package MainJava;

public class SingletonMain {
    public static void main(String[] args) {
           
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println("Hasecode of obj1 : "+obj1.hashCode());
        System.out.println("haseCode of obj2 : "+obj2.hashCode());

        if(obj1 == obj2){
            System.out.println(
                "Two objects point to the same memory location on the heap i.e, to the same object");
        }
        else {
            System.out.println(
                "Two objects DO NOT point to the same memory location on the heap");
        }
        
    }
}
