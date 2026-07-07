package leetcode;


//https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/
public class LeetCode3754 {
    public static void main(String[] args) {
        System.out.println(sumAndMultiply(10203004));
    }

    public static long sumAndMultiply(int n) {
        int ans = 0, sum = 0, unit = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                ans += digit * unit;
                unit *= 10;
                sum += digit;
            }
            n = n / 10;
        }
        return (long) sum * ans;
    }
}
