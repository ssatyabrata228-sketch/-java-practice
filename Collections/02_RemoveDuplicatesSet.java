import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesSet {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        Set<Integer> unique = new HashSet<>();

        for (int n : arr) unique.add(n);

        System.out.println(Arrays.toString(unique.toArray()));
    }
}

// Demonstrates Set and duplicate handling
// Average Time: O(n), Space: O(n)