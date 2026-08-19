import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = scan.nextLine();
           System.out.println("Enter Age:");
      int age=scan.nextInt();
        System.out.println("Name & Age " + name + " "+ age);
        scan.close();
    }
}