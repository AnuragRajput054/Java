package ExceptionHandling;

/**
 * ArthmeticException
 */
public class ArthmeticException {

    public static void main(String[] args) {
        int a = 10 , nums[] = {1,2,3} ;
        try{
            int b = 10/0;
            System.out.println(b);
            System.out.println(nums[1]);
        }
        catch(ArithmeticException e ){
            System.out.println(e+"\n please Do not Devide by Zero ");
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println(e);
        }
    }
}