import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        int a,b,c,ch;
        Scanner sc=new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multi[plication]");
        System.out.println("4. Division");
        System.out.println("5. Reminder");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();

        switch (ch) {
            case 1: System.out.println("Please enter First no");
                    a=sc.nextInt();
                    System.out.println("Please enter Second no");
                    b=sc.nextInt();
                    c=a+b;
                    System.out.println("Additon of Two no="+c);
                    break;

            case 2: System.out.println("Please enter First no");
                    a=sc.nextInt();
                    System.out.println("Please enter Second no");
                    b=sc.nextInt();
                    c=a-b;
                    System.out.println("Subtraction of Two no="+c);
                    break;

            case 3: System.out.println("Please enter First no");
                    a=sc.nextInt();
                    System.out.println("Please enter Second no");
                    b=sc.nextInt();
                    c=a*b;
                    System.out.println("Multiplication of Two no="+c);
                    break;

            case 4: System.out.println("Please enter First no");
                    a=sc.nextInt();
                    System.out.println("Please enter Second no");
                    b=sc.nextInt();
                    c=a/b;
                    System.out.println("Division of Two no="+c);
                    break;

            case 5: System.out.println("Please enter First no");
                    a=sc.nextInt();
                    System.out.println("Please enter Second no");
                    b=sc.nextInt();
                    c=a%b;
                    System.out.println("Reminder of Two no="+c);
                    break;

            default:System.out.println("Please enter valid choice ");
                    break;
        }
    }

    
}
