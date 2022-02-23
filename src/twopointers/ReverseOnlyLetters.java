package twopointers;

/**
 * @author Marshal
 * @since 2022/2/23
 */
public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && !Character.isLetter(arr[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }
            if (left < right) {
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        return String.valueOf(arr);
    }
}
