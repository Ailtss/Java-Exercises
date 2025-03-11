
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {

        String file = "literacy.csv";

        List<String[]> linhas = readString(file);


        linhas.stream().map(s -> {
            s[2] = s[2].replaceAll("[(%)]", "");
            s[2] = s[2].trim();
            return s;
    
        }).sorted((p1, p2) -> {
            return p1[5].compareTo(p2[5]);
        }).forEach( s-> {
            System.out.print(s[3] + " (" + s[4] + "), " + s[2] + ", " + s[5] + "\n");
        });
 
        // linhas.stream().sorted((p1, p2) -> {
        //     return p1[5].compareTo(p2[5]);
        // })
        // .forEach(s -> {
        //     System.out.println(s[3] + " (" + s[4] + "), " + s[2] + ", " + s[5] + "\n");
        // });;

    }

    public static List<String[]> readString(String file) {

        List<String[]> s = new ArrayList<>();

        try {

            s = Files.lines(Paths.get(file)).map(f -> f.split(","))
            .collect(Collectors.toList());
        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        return s;
    }

    public static void print(String[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].trim();

            if (i == 0) {
                System.out.print(s[i] + ", ");
            } else if (i % 5 == 0) {
                System.out.print(s[i] + "\n");
            } else {
                System.out.print(s[i] + ", ");
            }

        }
    }

    public static void printNew(String[] s) {

        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].trim();
            System.out.println(s[3] + " (" + s[4] + "), " + s[2] + ", " + s[5] + "\n");
        }
    }

}
