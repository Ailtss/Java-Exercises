
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here

        String file = "lines.txt";

        List<String> lines = read(file);

        lines.stream().forEach(l -> System.out.println(l));



    }


    public static List<String> read (String file) {

        List<String> rows = new ArrayList<>();


        try {

            Files.lines(Paths.get(file)).forEach(row -> rows.add(row));

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        return rows;


    } 

}
