
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*ArrayList<String> identifiers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> all = new ArrayList<>();
        
        while (true) {
            
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            
            if(id.equals("")) {
                
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.equals("")) {
                
                break;
            }
            
            if (identifiers.contains(id)) {
                
                continue;
            }
            
            identifiers.add(id);
            names.add(name);
            
            
        }
        
        
        for (int i = 0; i < identifiers.size(); i++) {
            
            all.add(identifiers.get(i)+": "+names.get(i));
        }
        
        
        System.out.println("==Items==");
        for (String a: all) {
            
            System.out.println(a);
        }*/
        
        
        ArrayList<Item> itens = new ArrayList<>();
        
        while (true) {
            
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            
            if (id.equals("")) {
                
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.equals("")) {
                
                break;
            }
            
            Item i = new Item(id, name);
           
            if (itens.contains(i)) {
                
                continue;
            }
            
            itens.add(i);
            
            
        }
        
        System.out.println("==Items==");
        for (Item a: itens) {
            
            System.out.println(a);
        }


    }
}
