package leetcode;

public class LeetCode1358 {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }

    /*
        Using sliding window to iterate elements,
         if the count reaches exactly 1 or more to element we'll increment the substring value
     */
    public static int numberOfSubstrings(String s) {
        int left = 0, length = s.length(), ans = 0;
        int[] counts = new int[3];
        for (int right = 0; right < length; right++) {
            counts[s.charAt(right) - 'a']++;
            if (counts[0] > 0 && counts[1] > 0 && counts[2] > 0) {
                ans += length - right;
                counts[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }
}
