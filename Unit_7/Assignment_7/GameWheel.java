package Unit_7.Assignment_7;

import java.util.ArrayList;

public class GameWheel {
    private ArrayList<Slice> slices; // List of slices making up the wheel
    private int currentPos; // Position of currently selected slice on wheel

    /*
     * Returns string representation of GameWheel with each numbered slice on a new
     * line
     */
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            string.append(i + " - " + slices.get(i).toString() + "\n");
        }
        return string.toString();
    }

    /*
     * Randomizes the positions of the slices that are in the wheel, but without
     * changing the pattern of the colors
     */
    public void scramble() {
        ArrayList<Slice> blue = new ArrayList<>();

        ArrayList<Slice> black = new ArrayList<>();

        ArrayList<Slice> red = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            if (slices.get(i).getColor().equals("red")) {
                red.add(slices.get(i));
            } else if (slices.get(i).getColor().equals("black")) {
                black.add(slices.get(i));
            } else {
                blue.add(slices.get(i));
            }
        }
        // clears arraylist so we can use add instead of set
        slices.clear();

        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0) {
                slices.add(black.remove((int) (Math.random() * black.size())));
            } else if (i % 2 == 1) {
                slices.add(red.remove((int) (Math.random() * red.size())));
            } else {
                slices.add(blue.remove((int) (Math.random() * blue.size())));
            }
        }

    }

    private void insertionSort(ArrayList<Slice> list) {
        for (int i = 1; i < list.size(); i++) {
            int index = i;
            int temp = list.get(i).getPrizeAmount();
            while (index > 0) {
                if (temp >= list.get(index - 1).getPrizeAmount()) {
                    break;
                }
                list.add(index - 1, list.remove(index));
                index--;
            }
        }
    }

    /*
     * Sorts the positions of the slices that are in the wheel by prize amount, but
     * without changing the pattern of the colors.
     */
    public void sort() {
        ArrayList<Slice> blue = new ArrayList<>();

        ArrayList<Slice> black = new ArrayList<>();

        ArrayList<Slice> red = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0) {
                // nextInt(int i) is exclusive
                black.add(slices.get(i));
            } else if (i % 2 == 1) {
                red.add(slices.get(i));
            } else {
                blue.add(slices.get(i));
            }
        }

        slices.clear();
        insertionSort(black);
        insertionSort(blue);
        insertionSort(red);

        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0) {
                // nextInt(int i) is exclusive
                slices.add(black.remove(0));
            } else if (i % 2 == 1) {
                slices.add(red.remove(0));
            } else {
                slices.add(blue.remove(0));
            }
        }

    }

    /* COMPLETED METHODS - YOU DO NOT NEED TO CHANGE THESE */

    /*
     * Creates a wheel with 20 preset slices
     */
    public GameWheel() {
        this(getStandardPrizes());
    }

    /*
     * Creates a wheel with 20 slices, using values from array parameter
     */
    public GameWheel(int[] prizes) {
        currentPos = 0;
        slices = new ArrayList<Slice>();
        for (int i = 0; i < 20; i++) {
            int pa = 0;
            String col = "blue";
            if (i < prizes.length)
                pa = prizes[i];
            if (i % 5 == 0)
                col = "black";
            else if (i % 2 == 1)
                col = "red";
            slices.add(new Slice(col, pa));
        }
    }

    /*
     * Spins the wheel by so that a different slice is selected. Returns that slice
     * (Note: the 10 slices following the current slice are more likely to be
     * returned than the other 10).
     */
    public Slice spinWheel() {
        // spin power between range of 1-50 (inclusive)
        int power = (int) (Math.random() * 50 + 1);
        int newPos = (currentPos + power) % slices.size();
        currentPos = newPos;
        return slices.get(currentPos);
    }

    public Slice getSlice(int i) {
        int sliceNum = i;
        if (i < 0 || i > 19)
            sliceNum = 0;
        return slices.get(sliceNum);
    }

    // Makes an array with a standard list of prizes
    private static int[] getStandardPrizes() {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0)
                arr[i] = i * 1000;
            else if (i % 2 == 1)
                arr[i] = i * 100;
            else
                arr[i] = i * 200;
        }
        return arr;
    }
}
