
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        int first = 0;
        int second = 0;
        
        System.out.println("Give the first number:");
        first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        second = Integer.valueOf(scanner.nextLine());
        
        System.out.println(first + " * " + second + " = " + (first * second));

    }
}
