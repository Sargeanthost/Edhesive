package Unit_6.Assignment_6;

public class NumStatsArray {

    private final double[] arr;

    // int arrLength;
    public NumStatsArray(double[] a) {
        arr = a;
        // arrLength = a.length;
    }

    public String toString() {
        String contents = "";
        for (int i = 0; i < arr.length - 1; i++) {
            contents += arr[i] + ", ";
        }
        return "{" + contents + arr[arr.length - 1] + "}";
    }

    public double average() {
        double s = 0;
        for (double d : arr) {
            s += d;
        }
        return s / arr.length;
    }

    public double range() {
        double max = 0;
        double min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max - min;
    }

    public int sortStatus() {

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
                break;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false;
                break;
            }
        }

        if (ascending == true) {
            return 1;
        } else if (descending == true) {
            return -1;
        } else {
            return 0;
        }
    }

}
