public class GarbageCollectionDemo {

    static class MyObject {
        // Constructor to initialize the object
        public MyObject() {
            System.out.println("Object created!");
        }

        // finalize() method is called before garbage collection
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is being garbage collected!");
        }
    }

    public static void main(String[] args) {
        MyObject obj1 = new MyObject();  // Create an object
        obj1 = null;                     // Make the object eligible for GC

        // Suggest garbage collection
        System.gc();

        // Create another object to show that GC doesn't affect others
        MyObject obj2 = new MyObject();
    }
}
