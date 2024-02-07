import java.util.*;
public class EvenOdd {
    
    public static void main(String[] args) {
        int no;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any Number:");
        no=sc.nextInt();

        if(no%2==0){
            System.out.println("No is Even");
        }
        else{
            System.out.println("No is Odd");
        }
    }
}
