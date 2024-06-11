package Genrics;

public class Enums {
    enum Days{
        Monday , Tuesday , Wed , Thusday , Friday , Saturday , Sunday
    }
    public static void main(String[] args) {
        Days days ;
        days = Days.Monday;
        for (Days day : Days.values() ) {
            System.out.println(day);
        }
    }
}
