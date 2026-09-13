public class StringPalindrome {
    public static boolean isPalindrome(String text) {
        int left = 0, right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "madam";
        System.out.println(isPalindrome(text));
    }
}

// Two-pointer technique
// Time: O(n), Space: O(1)