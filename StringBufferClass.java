import java.util.*;
public class StringBufferClass {

    public static void main(String[] args) {
        
        StringBuffer sb=new StringBuffer("Hello World");
        
        System.out.println("Content of sb object="+sb);

        System.out.println("Length of String="+sb.length());

        System.out.println("Length of String="+sb.capacity());
    }
    
}
