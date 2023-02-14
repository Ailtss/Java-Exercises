
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        int first = 0;
        int second = 0;
        int third = 0;
        
        double average = 0;
        
        System.out.println("Give the first number:");
        first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        second = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        third = Integer.valueOf(scanner.nextLine());
        
        average = ((double)first + second + third)/3;
        
        System.out.println("The average is " + average);
        

    }
}
