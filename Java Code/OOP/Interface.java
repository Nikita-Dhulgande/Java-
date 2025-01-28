// Defining the interface
interface Animal {
    // Abstract method (doesn't have a body)
    void sound();

    // Abstract method
    void eat();
}

// Implementing the interface in the Dog class
class Dog implements Animal {
    // Implementing the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    // Implementing the eat method
    @Override
    public void eat() {
        System.out.println("Dog eats.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        d.eat();

    }
    
}
