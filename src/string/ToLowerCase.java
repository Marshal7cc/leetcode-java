package string;

/**
 * @author Marshal
 * @since 2021/12/12
 */
public class ToLowerCase {
    // 大写变小写、小写变大写 : 字符 ^= 32;
    //
    //大写变小写、小写变小写 : 字符 |= 32;
    //
    //小写变大写、大写变大写 : 字符 &= -33;
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 65 && c <= 90) {
                c |= 32;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
