
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            String line = scanner.nextLine();
            
            if (line.equals("")) {
                
                break;
            }
            
            String[] pieces = line.split(" ");
            
            for (String string: pieces) {
                
                if (string.contains("av")) {
                    
                    System.out.println(string);
                }
            }
        }


    }
}
