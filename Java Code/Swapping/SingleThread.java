public class SingleThread {
    public static void main(String[] args) {
        Thread t1=new Thread();
        t1.setName("My Main Thread");
        t1.setPriority(7);
        System.out.println(t1);
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
    }
    
}
