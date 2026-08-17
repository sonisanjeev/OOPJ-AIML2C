package pacakge.packageB;
import pacakge.packageA.*;

public class B extends A {
 public void show(){
    display();
 }

 public static void main(String[] args) {
    B obj = new B();
    obj.show();
 }
    
}

/* javac -d . pacakge\packageA\A.java pacakge\packageB\B.java
java pacakge.packageB.B */
