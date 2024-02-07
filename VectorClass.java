import java.util.*;
public class VectorClass {

    public static void main(String[] args) {
        Vector v1=new Vector();

        v1.addElement(new Integer(10));
        v1.addElement(new Integer(20));
        v1.addElement(new Integer(30));
        v1.addElement(new Integer(40));
        v1.addElement(new Integer(50));

        System.out.println(v1);
        System.out.println("vector size="+v1.size());
        v1.removeElementAt(2);
        v1.removeElementAt(3);
        System.out.println(v1);
        System.out.println("vector size="+v1.size());
    }
    }
    

