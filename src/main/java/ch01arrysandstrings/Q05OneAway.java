package ch01arrysandstrings;

/**
 * Created by vagrant on 3/26/18.
 */
public class Q05OneAway {

    private static boolean isOneAway(String s1, String s2){
        if (s1 == null || s2 == null) { return false;}
        if (s1.equals(s2)) { return true; }
        int diff = Math.abs(s1.length() - s2.length());
        if (diff > 1) { return false;}

        int minLen = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                if (++diff > 1){
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isOneAway(null, "ab") == false);
        System.out.println(isOneAway(null, null) == false);
        System.out.println(isOneAway("a", "abc") == false);
        System.out.println(isOneAway("", "") == true);
        System.out.println(isOneAway("abc", "abc") == true);
        System.out.println(isOneAway("pale", "pal") == true);
        System.out.println(isOneAway("pales", "pale") == true);
        System.out.println(isOneAway("pale", "bale") == true);
        System.out.println(isOneAway("pale", "bake") == false);
    }
}
