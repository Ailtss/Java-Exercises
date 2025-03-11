
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        List<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(-7);
        list.add(4);
        list.add(2);
        list.add(6);

        List<Integer> positiveNumbers = positive(list);

        for (int number : positiveNumbers) {
            System.out.println(number);
        }

        System.out.println("Count: " + list.stream().count());

        list.stream().filter(value -> value < 0).forEach(value -> System.out.println(value));

        list.stream().filter(value -> value < 0).map(i -> i * 2).forEach(value -> System.out.println(value));

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        long howManyNumbers = numbers.stream()
                .filter(i -> i < 4)
                .map(i -> i * 2)
                .filter(i -> i > 10)
                .count();

        System.out.println("Numbers: " + howManyNumbers);

    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(l -> l > 0).collect(Collectors.toList());
    }

}
