
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> points = new ArrayList<>();
//        ArrayList<Integer> passingPoints = new ArrayList<>();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        Grades g = new Grades();
        
        System.out.println("Enter point totals, -1 stops: ");
        
        while (true) {
           
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                
                break;
            }
            
            g.addGrade(input);
        }
             
        System.out.println("Point average (all): " + g.getAverageAll());
        
        if (g.checkPassingPoints()) {
            
            System.out.println("Point average (passing):" + "-");
        } else {
            
            System.out.println("Point average (passing): " + g.getAveragePassing());
        }
        
        System.out.println("Pass percentage: " + g.getPassPercentage());
        
        System.out.println("Grade distribution: ");
        g.gradeDistribution();
    }
    

}
