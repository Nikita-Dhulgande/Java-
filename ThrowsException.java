import java.util.*;
public class ThrowsException {

    void myMethod(int num) throws ArithmeticException,NullPointerException
    {
        if(num==1)
        {
            throw new ArithmeticException("ArithmeticException Occured");
        }
        else{
            throw new NullPointerException("NullPointerexception Occured");
        }
    }
    public static void main(String[] args) {
        ThrowsException obj=new ThrowsException();
        try{
            obj.myMethod(10);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
