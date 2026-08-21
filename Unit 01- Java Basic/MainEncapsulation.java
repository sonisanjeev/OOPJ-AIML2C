/* Encapsulation in Java is a fundamental concept in object-oriented programming (OOP) that refers to the wrapping of data and methods within a single unit, which is called a class in Java and keeps data hide from external class.

To follow the Encapsulation concept, declare class variables/attributes as private and to provide access public, get and set methods to access and update the value of a private variable.

The get method returns the variable value, and the set method sets the value of variable.

Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of its own class in which it is declared. */

 class Person {
    private String name; // private = restricted access
  
  
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }

 // Getter
    public String getName() {
      return name;
    }
  }
public class MainEncapsulation {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("Abhishek"); // Set the value of the name variable to "Abhishek"
    System.out.println(myObj.getName());
  }
}

//Encapsulation = Data hiding + Controlled access
//"Encapsulation is the process of binding data and methods into a single unit and restricting direct access to the data."
