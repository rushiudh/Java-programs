package leetcode;

public class LeetCode3612 {
    public static void main(String[] args) {
        String s = "a#b%*";
        System.out.println(processStr(s));
    }

    public static String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 97 && c <= 122)
                sb.append(c);
            else if (c == '*' && sb.length() != 0)
                sb.delete(sb.length() - 1, sb.length());
            else if (c == '#')
                sb.append(sb.toString());
            else if (c == '%')
                sb.reverse();
        }
        return sb.isEmpty() ? "" : sb.toString();
    }
}

