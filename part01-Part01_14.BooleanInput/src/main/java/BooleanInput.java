
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        
        System.out.println("Write something:");
        
        String text = scanner.nextLine();
        
        boolean value = Boolean.valueOf(text);
        
        System.out.println("True or false? " + value);

    }
}
