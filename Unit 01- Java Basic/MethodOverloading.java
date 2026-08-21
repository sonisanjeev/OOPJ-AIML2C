//Method Overloading (Compile-Time Polymorphism)Method overloading occurs when a class has multiple methods with the same name but different parameter lists. 

class Calculator {
    // Overloaded method: takes two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method: takes three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method: takes two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Compiler maps this to the first add() method
        System.out.println(calc.add(5, 10));       // Output: 15
        
        // Compiler maps this to the third add() method
        System.out.println(calc.add(5.5, 4.5));   // Output: 10.0
    }
}
 