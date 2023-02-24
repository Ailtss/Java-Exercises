import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.print("Title: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                
                break;
                
            }
            
            System.out.print("Pages: "); 
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication Year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            
            
            books.add(new Book(name, pages, pubYear));
            
        }
        
        System.out.println("");
        
        
        System.out.print("What information will be printed? ");
        String answer = scanner.nextLine();
        
        if(answer.equals("everything")) {
            
            for (Book b: books) {
                
                System.out.println(b);
            }
            
        } else if (answer.equals("name")) {
            
            for (Book b: books) {
                
                System.out.println(b.getTitle());
            }
            
        } else {
            
            System.out.println("Wrong answer!");
            
        }
        
        
        
    }
}
