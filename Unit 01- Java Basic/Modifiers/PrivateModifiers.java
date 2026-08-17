package Modifiers;
//example of private access modifier for inner class
/* class Outer {

    private class Inner {
        
        void display() {
            System.out.println("This is a private inner class");
        }
    }

    void show() {
        Inner obj = new Inner();
        obj.display();
    }
}

public class Main {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.show();
    }
} */

//example of private access modifier for variable and method
class A{
     private String name="Java";

     private void display(){
        System.out.println("Hello" + name);
    }

    // Getter and Setter for name if you want to access it from outside the class

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public class PrivateModifiers {

    public static void main(String[] args) {
        A obj = new A();
        // System.out.println(obj.name()); // This line will cause a compilation error because name is private
          System.out.println(obj.getName()); // usegetName() method to access the private variable name
        // obj.display(); // This line will cause a compilation error because display() is private
    }
    
}

// Solution: To fix the compilation error, you can change the access modifier of the display() method in class A from private to public or provide a public method in class A that calls the private display() method. Here's an example of both solutions:

