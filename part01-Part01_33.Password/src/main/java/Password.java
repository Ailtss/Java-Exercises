
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        
        //String password = "";
        
        System.out.println("Password?");
        //password = scan.nextLine();
        
        if (scan.nextLine().equals("Caput Draconis")) {
            
            System.out.println("Welcome!");
            
        } else {
            
            System.out.println("Off with you!");
            
        }
    }
}
