package leetcode;

import java.util.Arrays;

public class LeetCode1833 {
    public static void main(String[] args) {
        int[] costs = {7, 3, 3, 6, 6, 6, 10, 5, 9, 2};
        int coins = 56;
        System.out.println(maxIceCream(costs, coins));
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int cost : costs) {
            if (cost > coins)
                break;
            coins -= cost;
            count++;
        }
        return count;
    }
}
