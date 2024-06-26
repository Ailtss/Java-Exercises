
public class Main {

    public static void main(String[] args) {
        // test your classes here

        Box box = new Box(10);

        
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.7);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        box.add(book1);
        box.add(book2);
        box.add(book3);

        box.add(cd1);
        box.add(cd2);
        box.add(cd3);

        box.add(new Book("JK Rowling", "Harry Potter and The Sorcerer's Stone", 10));
        


        System.out.println(box);

    }

}
