
public class Main {

    public static void main(String[] args) {
        // Test your class here
        
        
        Room room = new Room();
        
        System.out.println("Empty room? " + room.isEmpty());
        System.out.println("Shortest person: " + room.shortest());
        
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        
        System.out.println("Empty room? " + room.isEmpty());
        
        System.out.println("");
        
        
        for (Person p: room.getPersons()) {
            
            System.out.println(p);
        }
        
        System.out.println("");
        
        System.out.println("Shortest person: " + room.shortest());
        System.out.println("Taking out the shortest person: " + room.take());
        System.out.println("");
        
        for (Person p: room.getPersons()) {
            
            System.out.println(p);
        }
        
        System.out.println("");
        
        System.out.println("Imprimindo e removendo as pessoas por ordem de altura: ");
        
        
        while (!room.isEmpty()) {
            
            System.out.println(room.take());
        }
        
        System.out.println("Empty room? " + room.isEmpty());
        
        
    }
}
