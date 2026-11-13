package leetcode;

public class LeetCode58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
//        String str = s.trim();
//        int len = str.length() - 1, count = 0;
//        while (len >= 0 && str.charAt(len) != ' ') {
//            len--;
//            count++;
//        }
//        return count;

        s = s.strip();
        return s.length() - s.lastIndexOf(" ") - 1;
    }
}
