package stack;

/**
 * @author Marshal
 * @date 2021/3/9
 */
public class RemoveDuplicates {
    public String removeDuplicates(String S) {
        int len = S.length();
        StringBuilder stack = new StringBuilder();

        char[] arr = S.toCharArray();
        for (int i = 0; i < len; i++) {
            int currentIdx = stack.length() - 1;
            if (currentIdx != -1 && stack.charAt(currentIdx) == (arr[i])) {
                stack.deleteCharAt(currentIdx);
            } else {
                stack.append(arr[i]);
            }
        }
        return stack.toString();
    }
}
