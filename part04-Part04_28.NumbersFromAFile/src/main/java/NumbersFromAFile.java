
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            int count = 0;
            
            while (fileReader.hasNextLine()) {
                
                int input = Integer.valueOf(fileReader.nextLine());
                
                if (input >= lowerBound && input <= upperBound) {
                    
                    count++;
                }
            }
            
            System.out.println("Numbers: " + count);
            
        } catch (Exception e) {
            
            System.out.println("Erro ao tentar ler o arquivo.");
        }

    }

}
