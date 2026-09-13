import java.util.HashMap;
import java.util.Map;

public class HashMapFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10};
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int n : arr) {
            frequency.put(n, frequency.getOrDefault(n, 0) + 1);
        }

        System.out.println(frequency);
    }
}

// Demonstrates HashMap and getOrDefault()
// Time: O(n) average, Space: O(n)