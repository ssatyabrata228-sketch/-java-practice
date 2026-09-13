public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        for (int n : arr) System.out.print(n + " ");
    }
}

// Average/Worst Time: O(n²), Best Time: O(n), Space: O(1)