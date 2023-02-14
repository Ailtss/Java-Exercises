
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        int firstNumber = 0;
        int secondNumber = 0;
        
        System.out.println("Give the first number:");
        firstNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        secondNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The sum of the numbers is " + (firstNumber + secondNumber));
        

    }
}
