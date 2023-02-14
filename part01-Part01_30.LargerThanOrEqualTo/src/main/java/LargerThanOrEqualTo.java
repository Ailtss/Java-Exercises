
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;
        
        System.out.println("Give the first number:");
        first = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give the second number:");
        second = Integer.valueOf(scan.nextLine());
        
        if (first > second) {
            
            System.out.println("Greater number is: " + first);
            
        } else if (second > first) {
            
            System.out.println("Greater number is: " + second);
            
        } else {
            
            System.out.println("The numbers are equal!");
        }
    }
}
