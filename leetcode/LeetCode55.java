package leetcode;

public class LeetCode55 {

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{5, 0, 0, 0, 0, 1}));
    }

    public static boolean canJump(int[] nums) {
        int finalPos = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= finalPos)
                finalPos = i;
        }
        return finalPos == 0;
    }
}
