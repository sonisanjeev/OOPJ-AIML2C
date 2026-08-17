package Modifiers;
public class StaticModifier {
    static int a = 10; // Static variable
    static int b; // Static variable

    //static block to initialize static variable b
    static {

         b=a*20;
        System.out.println("Static method called. Value of a: " + a);
        
    }
    public static void main(String[] args) {
        System.out.println("Value of b: " + b);
    }
}
