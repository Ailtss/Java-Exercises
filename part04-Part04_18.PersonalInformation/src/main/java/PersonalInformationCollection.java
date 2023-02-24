
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            
            if(firstName.isEmpty()) {
                
                break;
                
            }
            
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            
            if (lastName.isEmpty()) {
                
                break;
                
            }
            
            
            System.out.print("Identification number: ");
            String identification = scanner.nextLine();
            
          
            
            infoCollection.add(new PersonalInformation(firstName, lastName, identification));

           
        }
        
        System.out.println("");
        
        for (PersonalInformation p: infoCollection) {
            
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }

    }
}
