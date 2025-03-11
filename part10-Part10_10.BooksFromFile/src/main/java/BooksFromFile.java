
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        String file = "books.txt";

        List<Book> books = readBooks(file);

        books.stream().forEach(b -> System.out.println(b));
        System.out.println("Number of books: " + books.size());



    }

    public static List<Book> readBooks(String file) {

        List<Book> b = new ArrayList<>();
        
        try {

          b = Files.lines(Paths.get(file)).map(s -> s.split(",")).map(books -> new Book(books[0], Integer.valueOf(books[1]), Integer.valueOf(books[2]), books[3])).collect(Collectors.toList());

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        return b;
    }

}
