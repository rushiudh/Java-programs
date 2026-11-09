package leetcode;

import java.util.Arrays;

public class LeetCode274 {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{7, 4, 3, 2, 1}));
    }

    public static int hIndex(int[] citations) {
        int h = 0;
        Arrays.sort(citations);
        for (int i = citations.length - 1, j = 0; i >= 0; i--, j++) {
            if (citations[i] > j)
                h++;
        }
        return h;
    }
}

