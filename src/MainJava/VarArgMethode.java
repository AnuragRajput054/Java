package MainJava;
// This is The Var-Arg Methods In Java , Introduce in 1.5version of java. by this we can declear a methode by variable number of arguments.
public class VarArgMethode {

    int m , p , c  ;
    public static void main(String... args) {


          varArgument(10);
          varArgument();
          varArgument(10,20);
          System.out.println(mark(10,20,30,40,50));

          VarArgMethode student1 = new VarArgMethode();
          int marks = student1.mark(10,20,30,40,50,60);
          System.out.println(marks);
    }

    public static void varArgument(int ...x){
        System.out.println("Hello : This is The Variable Argument Method");
        for (int i : x) {
            System.out.println(i);
        }
    }
    // Gernral Method 
    public static void varArgument(){
        System.out.println("Genral Methods");
    }
    public static int mark(int... x){
        int total = 0 ;
        for (int i : x) {
            total += i ;
        }
        return total;
    }

    
}
