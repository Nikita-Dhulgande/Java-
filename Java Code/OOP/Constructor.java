class Person {
    String name;
    int age;

    // Constructor
    Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main program
public class Constructor {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25); // Constructor is called
        person1.displayDetails(); // Output: Name: Alice, Age: 25
    }
}
