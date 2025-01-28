public class PrimeNo {
    public static void main(String[] args) {
        int no=29;
        boolean isPrime=true;

        for(int i=2;i<no; i++) {
            if (no%i==0) {
                isPrime=false;
                break;
            }
        }

        if (isPrime && no > 1 )  {
           System.out.println(no + "is a prime number");    
        }
        else {
            System.out.println(no + "is not a  prime number");    
        }
    }
    
}
