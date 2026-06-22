package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1189 {
    public static void main(String[] args) {
        String text = "nlaebolko";
        System.out.println(maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {
        int[] count = new int[26];
        for (char c : text.toCharArray())
            count[c - 'a']++;
        return Math.min(
                Math.min(count['b' - 'a'], count['a' - 'a']),
                Math.min(Math.min(count['l' - 'a'] / 2, count['o' - 'a'] / 2), count['n' - 'a']));
    }
}
