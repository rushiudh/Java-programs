package leetcode;

public class LeetCode45 {

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
    }

    public static int jump(int[] nums) {
        if (nums == null || nums.length <= 1)
            return 0;
        int jumps = 0, currEnd = 0, far = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            far = Math.max(far, i + nums[i]);
            if (i == currEnd) {
                jumps++;
                currEnd = far;
                if (currEnd >= nums.length - 1)
                    break;
            }
        }
        return jumps;
    }

    /*
    Dry run ->
         inputs -> 2  3  1  1  4
         i = 0
             far = max of 0 ,(0 + 2) = 2
             i = 0 = 0 true;
             jumps++;
             currEnd = 2;
             if curEnd >= len false;
         i = 1
            far = max of 2 , (1 + 3) = 4;
            i = 1 = 2; false;
         i = 2
            far = max of 4, (2+1) = 4
                i = 2 = 2 true;
                jumps++;
                currEnd = 4;
                if curEnd >= 4
                    break;
         return jumps;

    */
    /*
    Example 1:
    Input: nums = [2,3,1,1,4]
    Output: 2
    Explanation: The minimum number of jumps to reach the last index is 2.
    Jump 1 step from index 0 to 1, then 3 steps to the last index.
     */
}
