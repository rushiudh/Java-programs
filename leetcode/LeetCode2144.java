package leetcode;

import java.util.Arrays;

public class LeetCode2144 {
    public static void main(String[] args) {
        int[] cost = {6, 5, 7, 9, 2, 2};
        System.out.println(minimumCost(cost));
    }

    //16 - 6 + 7 - 2
    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int maxCost = 0;
        for (int i = cost.length - 1; i >= 0; i -= 3) {
            maxCost += cost[i];
            if (i - 1 >= 0)
                maxCost += cost[i - 1];
        }
        return maxCost;
    }
}
