import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaAndStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> even = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        even.forEach(n -> System.out.println(n));
    }
}

// Demonstrates lambda expressions, Stream API and filter().