import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=10,b=5,c=5,d;
        System.out.println("Program Execution Begin....");
        try{
        d=(a/(b-c));
        System.out.println("value od d="+d);
        }

        catch(Exception e) //SuperClass
        {
            System.out.println("Exception occured:"+e);
        }
        // catch(NullPointerException e){

        //     System.out.println("Null Pointer exception is occured!!!");
        // }
        
        // catch(ArithmeticException e){

        //     System.out.println("Divide by Zero exception is occured!!!");
        // }
        // finally
        // {
        //     System.out.println("I am always Executed!!!");
        // }

        System.out.println("Program Executon handle....");
    }
    
}
