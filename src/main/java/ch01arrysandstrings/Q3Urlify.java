package ch01arrysandstrings;

public class Q3Urlify {

    public static String toUrlify(String s){
        if ( s == null || s.length() ==0) {
            return null;
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        while (chars[len - 1] == ' ') {
            len--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' ') {
                sb.append("%20");
            } else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toUrlify("Mr John Smith   ").equals("Mr%20John%20Smith"));
    }
}
