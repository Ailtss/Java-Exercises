
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        int days = 0;
        
        System.out.println("How many days would you like to convert to seconds?");
        days = Integer.valueOf(scanner.nextLine());
        
        int seconds = days * 24 * 60 * 60;
        
        
        System.out.println(seconds);
        
        
        
        // System.out.println(seconds);
        

    }
}
