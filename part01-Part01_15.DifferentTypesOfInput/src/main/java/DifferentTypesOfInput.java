
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        int integer = 0;
        double doub = 0;
        boolean boo = false;
        
        
        System.out.println("Give a string:");
        String string = scan.nextLine();
        
        System.out.println("Give an integer:");
        integer = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        doub = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boo = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + doub);
        System.out.println("You gave the boolean " + boo);
        

    }
}
