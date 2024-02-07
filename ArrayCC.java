import java.util.*;

public class ArrayCC {
    public static void main(String[] args) {

        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("length of array="+marks.length);

        System.out.println("DS:"+marks[0]);
        System.out.println("Java:"+marks[1]);
        System.out.println("Python:"+marks[2]);

        marks[2]=99; //update marks
        System.out.println("Python:"+marks[2]);

    }
    
}
