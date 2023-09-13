
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ailton Gabriel
 */
public class UserInterface {
    
    private TodoList list;
    private Scanner scanner;
    public UserInterface(TodoList list, Scanner scanner) {
        
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        
        while (true) {
            
            System.out.println("Command: ");
            String input = this.scanner.nextLine();
            
            if (input.equals("stop")) {
                
                break;
            } else if (input.equals("add")) {
                
                System.out.println("To add: ");
                this.list.add(this.scanner.nextLine());
            } else if (input.equals("list")) {
                
                this.list.print();
            } else if (input.equals("remove")) {
                
                System.out.println("Which one is removed? ");
                int number = Integer.valueOf(this.scanner.nextLine());                
                this.list.remove(number);
            }
            
            
        }
    }
    
}
