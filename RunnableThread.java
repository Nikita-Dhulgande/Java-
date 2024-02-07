import java.util.*;


class RunnableX implements Runnable {
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println("From ThreadX  :i:"+i);
        }
    }
}
class RunnableY implements Runnable {
    public void run(){
        for(int j=1;j<=5;j++)
        {
            System.out.println("From ThreadY :j:"+j);
        }
     }

}

public class RunnableThread {
    public static void main(String[] args) {
        RunnableX r1=new RunnableX();
        RunnableY r2=new RunnableY();

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }
}
