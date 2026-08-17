public class Constructor {
    static String name = "Ajay"; // static variable can be accessed without creating object of class
    int age = 20; // non static variable can be accessed only by creating object of class
    int id;
    int RollNo;
    String Email;

    void Display() {
        System.out.println("Age: " + age);
    }
    // default constructor
    /*
     * Demo(){
     * System.out.println("Default Constructor called");
     * }
     */

    // constructor with parameters
    Constructor(int i, int RollNo, String Email) {
        this.id = i;
        this.RollNo = RollNo;
        this.Email = Email;
    }
    //copy constructor
    Constructor(Constructor c) {
        this.id = c.id;
        this.RollNo = c.RollNo;
        this.Email = c.Email;
    }

    //constructor overloading
    Constructor(int i, int RollNo) {
        this.id = i;
        this.RollNo = RollNo;
    }

    void Details() {
        System.out.println("Id: " + id);
        System.out.println("RollNo: " + RollNo);
        System.out.println("Email: " + Email);
    }

    public static void main(String[] args) {
        // String name="Vikas";
        System.out.println("Hello World");
        System.out.println("Student name: " + name);

        //Defualt Constructor
       /*  Demo obj=new Demo();
        obj.Display(); */

        // parameterized constructor
       /*  Demo obj1 = new Demo(1, 100045, "xyz@gmail.com");
        obj1.Details(); */

        //copy constructor
        Constructor obj1 = new Constructor(1, 100045, "xyz@gmail.com");
        Constructor obj2 = new Constructor(obj1);
        obj2.Details();

        //constructor overloading
        Constructor obj3 = new Constructor(2, 100046);
        obj3.Details();

    }
}