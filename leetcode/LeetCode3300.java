package leetcode;

public class LeetCode3300 {
    public static void main(String[] args) {
        int[] arr = {999, 19, 199};
        System.out.println(minElement(arr));
    }

    public static int minElement(int[] nums) {
        int a = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int j = 0;
            while (x > 0) {
                j += x % 10;
                x = x / 10;
            }
            a = Math.min(a, j);

        }
        return a;
    }
}
