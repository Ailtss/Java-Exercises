
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        int number = 0;
        
        System.out.println("Giver number:");
        number = Integer.valueOf(scan.nextLine());
        
        if (number == 1984) {
            
            System.out.println("Orwell");
        }
    }
}
