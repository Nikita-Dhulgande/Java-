import java.util.*;

public class ThrowException {
    void validate(int age)
    {
        if(age<18)
        {
            try
            {
                throw new ArithmeticException("Not valid age for voting");
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            
        }
        else
        {
            System.out.println("You are eligible fo rvoting");
        }
    }
    public static void main(String[] args) {
        ThrowException t1=new ThrowException();
        t1.validate(16);
    }
    
}
