package GayleLaakmann.exercises.recursion;

import java.util.Arrays;

public class CoinChange {
    public int change(int amount, int[] coins) {
        int[] ways = new int[amount + 1];
        ways[0] = 1;
        for (int coin : coins) {
            if (coin > amount) continue;
            for (int i = 1; i < ways.length; i ++) {
                if (i >= coin) {
                    ways[i] += ways[i - coin];
                }
            }
        }
        return ways[amount];
    }
}
