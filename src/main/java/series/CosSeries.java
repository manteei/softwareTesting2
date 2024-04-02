package series;

public class CosSeries {

    static private final double eps = 0.0000001;

    public Double apply(Double value) {
        if (value.isNaN() || value.isInfinite()) {
            return Double.NaN;
        }
        double s, an;
        int n;
        n = 0;
        an = 1;
        s = 0;
        while (Math.abs(an) > eps) {
            s += an;
            n++;
            an *= -value * value / (2 * n - 1.0) / (2.0 * n);
        }
        return s;
    }
}
