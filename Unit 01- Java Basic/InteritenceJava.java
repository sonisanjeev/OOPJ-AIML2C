import java.io.*;
 // Base or Super Class
class Employee {
    int salary = 60000;
}
 // Inherited or Sub Class
class Engineer extends Employee {
    int benefits = 10000;
}
class InteritenceJava {
    public static void main(String args[])
    {
        Engineer E1 = new Engineer();
        System.out.println("Total Amount " + (E1.salary+E1.benefits));
    }
}
