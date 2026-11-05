package leetcode;

public class LeetCode1385 {
    public static void main(String[] args) {
        System.out.println(findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int k : arr1) {
            boolean flag = true;
            for (int i : arr2)
                if (Math.abs(k - i) <= d) {
                    flag = false;
                    break;
                }
            if (flag)
                count++;
        }
        return count;
    }
}
