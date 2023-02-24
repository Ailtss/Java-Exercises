import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.print("Name: ");
            String program = scanner.nextLine();
            
            if (program.isEmpty()) {
                
                break;
                
            }
            
            
            
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            
            programs.add(new TelevisionProgram(program, duration));
            
            
        }
        
        
        System.out.println("");
        
        
        System.out.print("Program's maximum duration? ");
        int maximumDuration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram p: programs) {
            
            if (p.getDuration() <= maximumDuration) {
                
                System.out.println(p);
            }
        }

    }
}
