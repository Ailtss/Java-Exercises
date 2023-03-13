
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            while (fileReader.hasNextLine()) {
                
                String line = fileReader.nextLine();
                
                if (line.isEmpty()) {
                    
                    continue;
                }
                
                String[] info = line.split(",");
                
                int age = Integer.valueOf(info[1]);
                
                if (age == 1) {
                    
                    System.out.println(info[0] + ", age: " + age + " year");
                } else {
                    
                    System.out.println(info[0] + ", age: " + age + " years");
                }
            }
            
        } catch (Exception e) {
            
            System.out.println("Erro ao tentar ler o arquivo com esse nome.");
        }

    }
}
