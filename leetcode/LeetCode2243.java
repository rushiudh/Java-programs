package leetcode;

public class LeetCode2243 {
    public static void main(String[] args) {
        System.out.println(digitSum("11111222223", 3));
    }

    public static String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;
                int end = Math.min(s.length(), i + k);
                for (int j = i; j < end; j++)
                    sum += s.charAt(j) - '0';
                sb.append(sum);
            }
            s = sb.toString();
        }
        return s;
    }
}
