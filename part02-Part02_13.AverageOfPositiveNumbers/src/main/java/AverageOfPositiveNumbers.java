
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
        int sumPositive = 0;
        
        double averagePositive = 0;
        
        while (true) {
            
            int value = Integer.valueOf(scanner.nextLine());
            
            if (value == 0) {
                
                break;
                
            } else if (value > 0) {
                
                number = number + 1;
                sumPositive = sumPositive + value;
                
            }
            
        }
        
        
        
        if (number == 0) {
            
            System.out.println("Cannot calculate the average");
            
        } else {
            
            averagePositive = ((double) sumPositive / number);           
            System.out.println(averagePositive);
        }

    }
}
