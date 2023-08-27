
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        
        Scanner scan = new Scanner(System.in);
        BirdWatcher w = new BirdWatcher();
        
        
        while (true) {
            
            System.out.println("?");
            String command = scan.nextLine().toLowerCase();
            
            if (command.equals("quit")) {
                
                break;
            } else if (command.equals("add")) {
                
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                
                w.addBird(name, latinName);
                
            } else if (command.equals("observation")) {
                
                System.out.println("Bird?");
                String observation = scan.nextLine();
                
                if (!w.checkBird(observation)) {
                    
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("all")) {
                
                w.print();
            } else if (command.equals("one")) {
                
                System.out.println("Bird?");
                String birdName = scan.nextLine();
                
                w.print(birdName);
            }
            
        }

    }

}
