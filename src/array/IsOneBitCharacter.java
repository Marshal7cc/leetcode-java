package array;

/**
 * @author Marshal
 * @since 2022/2/20
 */
public class IsOneBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        int length = bits.length;

        int i = 0;
        while (i < length) {
            if (i == length - 1) {
                return true;
            }
            if (bits[i] == 0) {
                i++;
            }
            if (bits[i] == 1) {
                i = i + 2;
            }
        }
        return false;
    }
}
