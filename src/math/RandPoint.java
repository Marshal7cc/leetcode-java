package math;

import java.util.Random;

/**
 * @author Marshal
 * @since 2022/6/5
 */
public class RandPoint {
    private double r;
    private double xc;
    private double yc;
    private Random random;

    public RandPoint(double radius, double x_center, double y_center) {
        this.r = radius;
        this.xc = x_center;
        this.yc = y_center;

        this.random = new Random();
    }

    public double[] randPoint() {
        while (true) {
            double x = random.nextDouble() * (2 * r) - r;
            double y = random.nextDouble() * (2 * r) - r;
            if (x * x + y * y <= r * r) {
                return new double[]{xc + x, yc + y};
            }
        }

    }
}
