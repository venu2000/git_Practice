import java.util.function.DoubleUnaryOperator;

public class Maths {

    public double integrate(DoubleUnaryOperator function, double lowerBound,
            double upperBound, int intervals) {
        if (intervals <= 0) {
            throw new IllegalArgumentException("Intervals must be greater than zero");
        }

        double width = (upperBound - lowerBound) / intervals;
        double total = (function.applyAsDouble(lowerBound)
                + function.applyAsDouble(upperBound)) / 2;

        for (int index = 1; index < intervals; index++) {
            double x = lowerBound + index * width;
            total += function.applyAsDouble(x);
        }

        return total * width;
    }

    public String Integration() {
        return "I";
    }

    public String Stats() {
        return "S";
    }
}