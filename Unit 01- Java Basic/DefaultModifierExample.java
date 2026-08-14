class Student {
    String name;
}

public class DefaultModifierExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ajay"; // default access modifier allows access within the same package and class
        System.out.println("Student name: " + student.name);
    }
}
