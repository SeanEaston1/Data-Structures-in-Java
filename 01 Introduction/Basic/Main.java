import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      // Printing something
        System.out.print("Hello World! ");
        
        System.out.println("My name is Tanay");  // ln is used to add a line 


      // Scanner is used to take input from user
        Scanner input = new Scanner(System.in);
      
      
        System.out.println(input.nextInt());    // It will parse the integer in the output section
        
        System.out.println(input.next());       // It will parse the next string
        
        System.out.println(input.nextLine());   // It will parse the entire line
    }
}
