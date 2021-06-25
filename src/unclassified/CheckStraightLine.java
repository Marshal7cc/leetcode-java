package unclassified;

/**
 * @author Marshal
 * @date 2021/6/25
 */
public class CheckStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];

        int x = coordinates[1][0] - x0;
        int y = coordinates[1][1] - y0;

        for (int i = 2; i < coordinates.length; i++) {
            int xi = coordinates[i][0] - x0;
            int yi = coordinates[i][1] - y0;

            if (x * yi != xi * y) {
                return false;
            }
        }
        return true;
    }
}
