package leetcode;

public class LeetCode3105 {
    public static void main(String[] args) {
        System.out.println(longestMonotonicSubarray(new int[]{1, 4, 3, 3, 2}));
    }

    public static int longestMonotonicSubarray(int[] nums) {
        int inc = 1, dec = 1, ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                dec++;
                inc = 1;
            } else if (nums[i - 1] < nums[i]) {
                inc++;
                dec = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            ans = Math.max(ans, Math.max(inc, dec));
        }
        return ans;
    }
}
