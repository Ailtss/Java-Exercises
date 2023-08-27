
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
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    
    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        
        this.scanner = scan;
        this.dictionary = dictionary;
    }
    
    
//    public void start() {
//        
//        while (true) {
//            
//            System.out.print("Command: ");
//            String command = this.scanner.nextLine();
//            
//            if (command.equals("end")) {
//                
//                System.out.println("Bye bye!");
//                break;
//            } else if (command.equals("add")) {
//                
//                System.out.print("Word: ");
//                String word = this.scanner.nextLine();
//                System.out.print("Translation: ");
//                String translation = this.scanner.nextLine();
//                
//                this.dictionary.add(word, translation);
//            } else if (command.equals("search")) {
//                
//                System.out.print("To be translated: ");
//                String word = this.scanner.nextLine();
//                
//                if (this.dictionary.translate(word) != null) {
//                    
//                    System.out.println("Translation: " + this.dictionary.translate(word));
//                } else {
//                    
//                    System.out.println("Word " + word + " was not found");
//                }            
//                
//            } else {
//                
//                System.out.println("Unknown command");
//            }
//        }
//        
//        
//    }
    
    
    
    public void start() {
        
        while (true) {
            
            System.out.print("Command: ");
            String word = this.scanner.nextLine();
            
            if (word.equals("end")) {
                
                System.out.println("Bye bye!");
                break;
            }
            
            processCommand(word);
        }
        
    }
    
    
    public void processCommand(String word) {
        
        
        if (word.equals("add")) {
            
            this.add();
            
        } else if (word.equals("search")) {
            
            this.search();
            
        } else {
            
            System.out.println("Unknown command");
        }
    }
    
    
    public void add() {
        
        System.out.print("Word: ");
        String input = this.scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        
        this.dictionary.add(input, translation);
        
    }
    
    public void search() {
            
        System.out.print("To be translated: ");
        String input = this.scanner.nextLine();        
        
        if (this.dictionary.translate(input) != null) {
            
            System.out.println("Translation: " + this.dictionary.translate(input));
        } else {
            
            System.out.println("Word " + input + " was not found");
        }
        
    }
           
    
}
