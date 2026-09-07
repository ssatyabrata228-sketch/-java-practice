import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {10, 25, 8, 40, 15};
        int target = 50;

        // Store value and original index
        int[][] nums = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            nums[i][0] = arr[i];  // value
            nums[i][1] = i;       // original index
        }

        // Sort according to value
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left][0] + nums[right][0];

            if (sum == target) {
                System.out.println("Index: " + nums[left][1] 
                                 + " and " + nums[right][1]);
                break;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
    }
}