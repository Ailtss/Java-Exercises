import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ailtongfd
 */
public class UserInterface {
    
    private JokeManager j;
    private final Scanner scanner;
    
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        
        this.j = manager;
        this.scanner = scanner;
    }
    
    
    public void start() {
        
        while (true) {
            
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String command = this.scanner.nextLine();
            
            if (command.equals("X")) {
                
                break;
            }
            
            this.proccessCommand(command);
        }
    }
    
    
    
    public void proccessCommand(String command) {
        
        if (command.equals("1")) {
            
            System.out.println("Write the joke to be added: ");
            String joke = this.scanner.nextLine();
            
            this.j.addJoke(joke);
        } else if (command.equals("2")) {
            
            System.out.println(this.j.drawJoke());
            
        } else if (command.equals("3")) {
            
            System.out.println("Printing the jokes.");
            this.j.printJokes();
        }
    }
    
}
