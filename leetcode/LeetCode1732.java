package leetcode;

public class LeetCode1732 {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));

    }

    public static int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int temp = 0;
        for (int i = 0; i < gain.length; i++) {
            temp += gain[i];
            maxAlt = Math.max(temp, maxAlt);
        }
        return maxAlt;
    }
}
