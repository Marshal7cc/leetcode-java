package unclassified;

/**
 * @author Marshal
 * @date 2021/6/19
 */
public class Maximum69Number {
    public int maximum69Number(int num) {
        String s = String.valueOf(num);
        return Integer.parseInt(s.replaceFirst("6", "9"));
    }
}
