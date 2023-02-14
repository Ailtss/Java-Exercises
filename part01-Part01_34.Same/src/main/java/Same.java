
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        String first = "";
        String second = "";
        
        System.out.println("Enter the first string:");
        first = scan.nextLine();
        
        System.out.println("Enter the second string:");
        second = scan.nextLine();
        
        if (first.equals(second)) {
            
            System.out.println("Same");
            
        } else {
            
            System.out.println("Different");
            
        }
    }
}
