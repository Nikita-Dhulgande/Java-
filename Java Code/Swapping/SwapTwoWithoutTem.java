public class SwapTwoWithoutTem {

    public static void main(String[] args) {
        int a=15, b=10;
         System.out.println("Before Swapping: a=" +a +",b=" +b);

         a=a+b;
         b=a-b;
         a=a-b;

         System.out.println("After Swapping: a=" +a +",b=" +b);

    }
    
}
