
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
    
    
    private TodoList todoList;
    private Scanner scanner;
    
    
    public UserInterface(TodoList todo, Scanner scan) {
        
        this.todoList = todo;
        this.scanner = scan;
    }
    
    
    public void start() {
        
        while (true) {
            
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            
            if (command.equals("stop")) {
                
                break;
            }
                      
            this.processCommand(command);
            
        }
    }
    
    
    public void processCommand(String command) {
        
        if (command.equals("add")) {
            
            System.out.print("To add: ");
            String task = this.scanner.nextLine();
            
            this.todoList.add(task);
        } else if (command.equals("list")) {
            
            this.todoList.print();
        } else if (command.equals("remove")) {
            
            System.out.print("Which one is removed? ");
            int index = Integer.valueOf(this.scanner.nextLine());
            
            this.todoList.remove(index);
        }
        
    }
    
    
}
