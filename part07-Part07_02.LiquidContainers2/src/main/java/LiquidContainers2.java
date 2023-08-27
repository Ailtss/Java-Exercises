
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();

        while (true) {
            
            
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] vector = input.split(" ");
            String command = vector[0];
            int amount = Integer.valueOf(vector[1]);
            
            if (command.equals("add")) {
                
                first.add(amount);
            } else if (command.equals("remove")) {
                
                second.remove(amount);
            } else if (command.equals("move")) {
                
                if (amount > first.contains()) {
                    amount = first.contains();
                   
                }
                
                second.add(amount);
                first.remove(amount);
                
            } 

        }

    }

}
