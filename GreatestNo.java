import java.util.*;
public class GreatestNo {
    
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);

        System.out.println("First Number:");
        a=sc.nextInt();
        System.out.println("Second Number:");
        b=sc.nextInt();
        System.out.println("Third Number:");
        c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("Greatest no is"+a);
        }
        else{
            if(b>a && b>c){
                System.out.println("Greatest no is"+b);
            }
           else{
            System.out.println("Greatest no is"+c);
           }
        }
    }
}
