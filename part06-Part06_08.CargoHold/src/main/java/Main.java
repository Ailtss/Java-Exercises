
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        
        Item book = new Item("The Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);
        
        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());
        
        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("TESNTANDO CLASSE Suitcase");
        System.out.println("");
        
        Suitcase suitcase = new Suitcase(10);
        System.out.println(suitcase);
        
        
        suitcase.addItem(book);
        System.out.println(suitcase);
        
        suitcase.addItem(phone);
        
        suitcase.addItem(brick);
        
        
        
        System.out.println("The suitcase contains the following items: ");
        suitcase.printItems();
        System.out.println("Total Weight: " + suitcase.totalWeight() + " kg");
        Item heaviest = suitcase.heaviestItem();
        
        System.out.println("Heaviest item: " + heaviest);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("TESTANDO CLASSE Hold");
        
        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);
        
        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);
        
        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);
        
        System.out.println(hold);
        
        System.out.println("The suitcases in the hold contain the following items: ");
        hold.printItems();
    }

}
