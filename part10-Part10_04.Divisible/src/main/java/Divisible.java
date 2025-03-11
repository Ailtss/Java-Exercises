
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));

        int sum = numbers.stream().reduce(0, (initial, value) -> initial + value);

        System.out.println("Sum: " + sum);
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        
        ArrayList<Integer> divisible = new ArrayList<>();

        divisible = numbers.stream().filter(number -> number % 3 == 0 || number % 2 == 0 || number % 5 == 0).collect(Collectors.toCollection(ArrayList::new));
        
        return divisible;
    }

}
