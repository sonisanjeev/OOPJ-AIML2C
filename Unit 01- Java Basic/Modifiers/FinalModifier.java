package Modifiers;

public class FinalModifier {

   final int num = 10;

    void update() {
        // num = 1000;   // ❌ Error: cannot assign a value to final variable num
        System.out.println(num);
    }

    public static void main(String[] args) {
        FinalModifier obj = new FinalModifier();
        obj.update();
    }
}