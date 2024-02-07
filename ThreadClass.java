import java.util.*;
class ThreadX extends Thread {
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println("From ThreadX class :i:"+i);
        }
    }
}
class ThreadY extends Thread{
    public void run(){
        for(int j=1;j<=5;j++)
        {
            System.out.println("From ThreadY class:j:"+j);
        }
     }

}


class ThreadClass {
    public static void main(String[] args) {
        
    ThreadX t1=new ThreadX() ;
    ThreadY t2=new ThreadY() ;
    t1.start();
    t2.start();

}
}
