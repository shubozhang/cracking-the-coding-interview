package ch01arrysandstrings;

/**
 * Created by vagrant on 3/26/18.
 */
public class Q09StringRotation {

    private static boolean isRotatedString(String s1, String s2) {
        s1 = s1 + s1;
        return s1.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isRotatedString("abcde", "cdeab") == true);
        System.out.println(isRotatedString("abcde", "cdeba") == false);
    }

}
