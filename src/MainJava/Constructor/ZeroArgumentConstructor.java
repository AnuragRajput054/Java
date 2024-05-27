package MainJava.Constructor;

public class ZeroArgumentConstructor {
    int a ,b, c ;
    ZeroArgumentConstructor(){    // This is No argunent Constructor.
        System.out.println("Hello : This is no Argument Constructor");
    }
    public static void main(String[] args) {
        ZeroArgumentConstructor s1 = new ZeroArgumentConstructor();
        ZeroArgumentConstructor s2 = new ZeroArgumentConstructor();
        ZeroArgumentConstructor s3 = new ZeroArgumentConstructor(10,20,30);
        s3.show();
    }
    ZeroArgumentConstructor(int x , int y , int z){   // This is Parametrize Constructor.
        a = x ;
        b = y ; 
        c = z ;
    }
    void show(){
        System.out.println(a+" "+b+" "+c);
    }
}
