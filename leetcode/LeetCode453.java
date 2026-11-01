package leetcode;

public class LeetCode453 {
    public static void main(String[] args) {
        System.out.println(minMoves(new int[]{1, 7, 3, 2, 4}));
    }

    public static int minMoves(int[] nums) {
        if (nums == null || nums.length <= 1)
            return 0;
        int min = nums[0];
        for (int i = 1; i < nums.length; i++)
            if (nums[i] < min)
                min = nums[i];
        int ans = 0;
        for (int num : nums) ans += num - min;

        return ans;
    }
}
