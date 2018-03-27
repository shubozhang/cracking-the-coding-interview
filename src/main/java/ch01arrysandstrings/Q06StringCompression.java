package ch01arrysandstrings;

/**
 * Created by vagrant on 3/26/18.
 */
public class Q06StringCompression {

    private static String zipString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char c0 = s.charAt(0);
        sb.append(c0);
        for (int i = 1; i < s.length(); i++) {
            if (c0 == s.charAt(i)) {
                count++;
            } else {
                sb.append(count);
                c0 = s.charAt(i);
                sb.append(c0);
                count = 1;
            }
        }
        sb.append(count);
        String res = sb.toString().length() < s.length() ? sb.toString() : s;
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(zipString("aabcccccaaa").equals("a2b1c5a3"));
        System.out.println(zipString("aabccccca").equals("a2b1c5a1"));

        System.out.println(zipString("A").equals("A"));
        System.out.println(zipString("abc").equals("abc"));
    }
}
