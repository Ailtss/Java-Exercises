
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = 0;
        int second = 0;
        
        first = Integer.valueOf(scanner.nextLine());
        second = Integer.valueOf(scanner.nextLine());
        
            
        double squareRoot = (double) first + second;
        squareRoot = Math.sqrt(squareRoot);
            
        System.out.println(squareRoot);
        

    }
}
