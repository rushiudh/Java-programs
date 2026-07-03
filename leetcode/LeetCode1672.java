package leetcode;

//Richest Customer Wealth
public class LeetCode1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int[] account : accounts) {
            int total = 0;
            for (int i : account) total += i;
            ans = Math.max(ans, total);
        }
        return ans;
    }
}
