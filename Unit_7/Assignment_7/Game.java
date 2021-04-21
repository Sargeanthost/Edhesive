package Unit_7.Assignment_7;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    public static void play(GameWheel g) {
        String s = ""; // smaple run p2
        int sum = 0;
        boolean same = true;
        Random rand = new Random();
        ArrayList<String> colors = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int randIndex = rand.nextInt();
            int money = g.getSlice(randIndex).getPrizeAmount();
            // 3 of same=double money
            colors.add(g.getSlice(randIndex).getColor());
            s += "Spin " + (i + 1) + " - " + g.getSlice(randIndex) + "\n";
            sum += money;
        }

        for (int i = 1; i < colors.size(); i++) {
            if (colors.get(i).equals(colors.get(i - 1))) {
                continue;
            } else {
                same = false;
                break;
            }
        }
        if (same) {
            sum *= 2;
            System.out.println("Total prize money: $" + sum + "\n");
            System.out.println(s);
            System.out.println("Three " + colors.get(0) + "s" + " = double your money!");
        } else {
            System.out.println("Total prize money: $" + sum + "\n");
            System.out.println(s);
        }
    }
}
