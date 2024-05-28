package MainJava.Keywords;

public class InstanceVariable {
    int a = 10 ;    // instance Variable
    public static void main(String[] args) {
        int b = 10 ;     // Local Variable 
        InstanceVariable i1 = new InstanceVariable();
        InstanceVariable i2 = new InstanceVariable();
        i1.a++;
        i2.a--;
        InstanceVariable i3 = i1;     // Refrensh Variable {Refresh Variable are the variable of class type & it is capable to hold the hashCode of any Object and can change the value of object, this concopt is known as immutable }
        System.out.println(i1.a);
        System.out.println(i2.a);
        System.out.println(b);
        System.out.println(i1.hashCode());
        i3.a++;
        System.out.println(i1.a);
    }
}
// THose variable which are deaclear non-statically inside the class are knows as Instancd Variable. We need to create the object to access this variable,Without creating object 
// we can't access the instance variable.