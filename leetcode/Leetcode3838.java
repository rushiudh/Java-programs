package leetcode;

public class Leetcode3838 {
    public static void main(String[] args) {
        String[] words = {"abcd", "def", "xyz"};
        int[] weights = {5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2};
        System.out.println(mapWordWeights(words, weights));
    }

    public static String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            int sum = 0;
            for (char c : word.toCharArray())
                sum = (sum + weights[c - 'a']) % 26;
            sb.append((char) ('a' + (25 - sum)));
        }
        return sb.toString();
    }
}
