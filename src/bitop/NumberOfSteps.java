package bitop;

/**
 * @author Marshal
 * @date 2021/3/14
 */
public class NumberOfSteps {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            // num&1 ==1 标识num是奇数，最后1位位1
            // num&-2 等价于 num-1  -2补码11111110
            // num>>1 右移一位 即除以2
            num = (num & 1) == 1 ? num & -2 : num >> 1;
        }
        return count;
    }
}
