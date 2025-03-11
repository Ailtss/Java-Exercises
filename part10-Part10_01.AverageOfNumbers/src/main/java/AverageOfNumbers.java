
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        List<Integer> numbers = new ArrayList<>();
        
        while (true) {

            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            int number = Integer.valueOf(input);

            numbers.add(number);

        }

        double average = numbers.stream().mapToInt(s -> s).average().getAsDouble();

        System.out.println("average of the numbers: " + average);

    }
}
