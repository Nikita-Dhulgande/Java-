
class Calculator {
    int add(int a, int b) 
    {
         return a + b; 
    }
    double add(double a, double b) 
    { 
        return a + b; 
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(76,46 ));
       System.out.println(c.add(6567, 76767886)); 

    }
    
}

