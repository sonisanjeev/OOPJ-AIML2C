package Modifiers;
class OuterClass{
    private static String name="Ajay";

    public static class InnerClass{
        public void display(){
            System.out.println("Name from OuterClass: "+name);
        }
    }
}

public class StaticClass {
  public static void main(String[] args) {
    OuterClass.InnerClass inner = new OuterClass.InnerClass();
    inner.display();
    System.out.println("Static method called.");
  }  
}
