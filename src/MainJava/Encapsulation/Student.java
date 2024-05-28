package MainJava.Encapsulation;

public class Student {
    
    private String name ;
    private int  roll_Number ;

    public void setName(String name , int roll_Number){
        this.name = name;
        this.roll_Number = roll_Number;
    }
    public String getName(){
        return name;
    }
    public int getRoll(){
        return roll_Number;
    }

}
