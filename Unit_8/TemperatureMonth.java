package Unit_8;

//Unit 8: Lesson 2
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.DoubleSummaryStatistics;

public class TemperatureMonth {

    private double[][] temperatures;

    public TemperatureMonth(double[][] t) {
        temperatures = t;
    }

    public double getMaxTemp() {
        // flatmap returns a "1d" stream of doubles. summarizing provides a list of
        // statistical methods we can use
        DoubleSummaryStatistics maxtemp = Arrays.stream(temperatures).flatMapToDouble(Arrays::stream)
                .summaryStatistics();
        return maxtemp.getMax();
    }

    public double getMinTemp() {
        DoubleSummaryStatistics maxtemp = Arrays.stream(temperatures).flatMapToDouble(Arrays::stream)
                .summaryStatistics();
        return maxtemp.getMin();
    }

    public double getMonthlyAverage() {
        // Remove return and implement getMonthlyAverage method here
        DoubleSummaryStatistics maxtemp = Arrays.stream(temperatures).flatMapToDouble(Arrays::stream)
                .summaryStatistics();
        return maxtemp.getAverage();
    }

    public double[] getWeeklyAverages() {
        // Remove return and implement getWeeklyAverages method here
        double[] weekAvg = new double[temperatures.length];
        int c = 0;
        for (double[] array : temperatures) {
            DoubleStream arrayStream = DoubleStream.of(array);
            double avg = arrayStream.summaryStatistics().getAverage();
            weekAvg[c] = avg;
            c++;
        }
        return weekAvg;
    }

}
