
class Animal { 
    void eat()
     {
         System.out.println("This animal eats food.");
         } 
    }
class Mammal extends Animal { 
    void walk()
     { 
        System.out.println("Mammal walks."); 
    } 
}
class Dog extends Mammal 
{ 
    void bark() 
    { 
        System.out.println("Dog barks.");
     }
    
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.bark();
        d.walk();
        d.eat();
    }
}



