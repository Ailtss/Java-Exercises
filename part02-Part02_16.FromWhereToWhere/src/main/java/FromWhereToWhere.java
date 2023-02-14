
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Where to?");
        
        int number = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        
        int start = Integer.valueOf(scanner.nextLine());
        
        
        if (number >= start) {
            
            for (int i = start; i <= number; i++) {
                
                System.out.println(i);
            }
        }
        
        
        
    }
}
