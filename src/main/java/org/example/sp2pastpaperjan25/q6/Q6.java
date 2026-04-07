package org.example.sp2pastpaperjan25.q6;

public class Q6 {
    public interface Measurable {
        double getMeasure();
    }

    public static double maxMeasureBBKExam24(Object[] arr) {
        double max = Double.NaN;

        for (Object o : arr) {
            if (o instanceof Measurable) {
                double m = ((Measurable) o).getMeasure();
                if (Double.isNaN(max) || m > max) {
                    max = m;
                }
            }
        }

        return max;
    }



}
