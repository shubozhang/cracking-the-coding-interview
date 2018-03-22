package ch01arrysandstrings;

public class Q01IsUnique {

    public static boolean isUnique2(String s) {
        if ( s == null || s.length() == 0 || s.length() > 128) {
            return false;
        }
        if ( s.length() == 1) {
            return true;
        }
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < s.length(); i++){
            int val = s.charAt(i);
            if (charSet[val]) {
                return false;
            } else {
                charSet[val] = true;
            }
        }
        return true;

    }
    public static boolean isUnique(String s) {

        if ( s == null || s.length() == 0) {
            return false;
        }
        if ( s.length() == 1) {
            return true;
        }
        boolean res = true;
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len - 1; i++){
            for ( int j = i + 1; j < len; j++){
                if (chars[i] == chars[j]){
                    res = false;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("A") == true);
        System.out.println(isUnique(null) == false);
        System.out.println(isUnique("") == false);
        System.out.println(isUnique("AbA") == false);
        System.out.println(isUnique("bcccd") == false);

        System.out.println(isUnique2("A") == true);
        System.out.println(isUnique2(null) == false);
        System.out.println(isUnique2("") == false);
        System.out.println(isUnique2("AbA") == false);
        System.out.println(isUnique2("bcccd") == false);
    }
}
