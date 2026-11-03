package leetcode;

public class LeetCode3736 {
    public static void main(String[] args) {
        System.out.println(minMoves(new int[]{4, 4, 5}));
    }

    private static int minMoves(int[] arr) {
        if (arr == null || arr.length <= 1)
            return 0;
        int max = arr[0], ans = 0;
        for (int i = 1; i < arr.length; i++)
            if (max < arr[i])
                max = arr[i];
        for (int x : arr)
            ans += max - x;
        return ans;
    }
}
