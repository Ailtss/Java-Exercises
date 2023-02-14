
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        int speed = 0;
        
        System.out.println("Give speed:");
        speed = Integer.valueOf(scanner.nextLine());
        
        if (speed > 120)
        {
            System.out.println("Speeding ticket!");
        }
    }
}
