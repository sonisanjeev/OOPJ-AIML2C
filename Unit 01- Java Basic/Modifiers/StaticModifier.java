package Modifiers;

public class StaticModifier {
    static int a = 10; // Static variable
    int b = 20; // non-Static variable/
    static int c;
    // static block to initialize static variable b
    static {
        c = a * 30;
        System.out.println("Static method called. Value of c: " + c);
    }
    public static void main(String[] args) {
        StaticModifier obj = new StaticModifier();

        System.out.println("Value of a: " + a);

        System.out.println("Value of b: " + obj.b);

    }
}
