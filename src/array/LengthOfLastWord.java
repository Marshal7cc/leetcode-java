package array;

/**
 * @author Marshal
 * @since 2021/9/21
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int n = s.length();

        int index = n - 1;
        while (index > 0 && s.charAt(index) == ' ') {
            index--;
        }

        int length = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            index--;
            length++;
        }
        return length;
    }
}
