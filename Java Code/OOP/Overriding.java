

class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        
        // Call the parent class's method using super
        super.sound();
   
        System.out.println("Dog barks.");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Calls the overridden method
    }
}
