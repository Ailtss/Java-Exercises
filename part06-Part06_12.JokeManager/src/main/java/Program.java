
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        
        JokeManager j = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(j, scanner);

        ui.start();
//        j.addJoke("What is red and smells of blue paint? - Red paint.");
//        j.addJoke("What is blue and smells of red paint? - Blue paint.");
        
//        System.out.println("Drawing jokes: ");
//        
//        for (int i = 0; i < 5; i++) {
//            
//            System.out.println(j.drawJokes());
//        }
//        
//        System.out.println("");
//        System.out.println("Printing jokes: ");
//        j.printJokes();
    }
}
