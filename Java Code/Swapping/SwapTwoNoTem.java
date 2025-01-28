public class SwapTwoNoTem {
    public static void main(String[] args) {
        int a=5, b=10;
        System.out.println("Before Swapping: a=" +a +",b="+ b);

        int temp=a;
        a=b;
        b=a;

        System.out.println("After Swapping: a=" +a + ",b="+b);
    }
}