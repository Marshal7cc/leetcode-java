package slidewindow;

/**
 * @author Marshal
 * @date 2021/2/23
 */
public class MaxSatisfied {
    public static void main(String[] args) {
        maxSatisfied(new int[]{1, 0, 1, 2, 1, 1, 7, 5}, new int[]{0, 1, 0, 1, 0, 1, 0, 1}, 3);
    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int len = customers.length;
        int count = 0;
        int maxIncr = 0;
        // 计算[0,x-1]的原始满意度
        // 以及初始X窗口位于[0,x-1]时候可以增加的满意度
        for (int i = 0; i < X; i++) {
            if (grumpy[i] == 0) {
                count += customers[i];
            }
            maxIncr += grumpy[i] == 0 ? 0 : customers[i];
        }

        int currentIncr = maxIncr;
        for (int i = 1; i <= len - X; i++) {
            if (grumpy[i + X - 1] == 0) {
                count += customers[i + X - 1];
            }

            currentIncr = currentIncr - (grumpy[i - 1] == 1 ? customers[i - 1] : 0) + (grumpy[i + X - 1] == 1 ? customers[i + X - 1] : 0);
            maxIncr = Math.max(currentIncr, maxIncr);
        }

        return count + maxIncr;
    }
}
