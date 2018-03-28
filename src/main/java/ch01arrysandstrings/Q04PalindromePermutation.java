package ch01arrysandstrings;

public class Q04PalindromePermutation {

    public static boolean isPalindromePermutation(String s){
        if (s == null || s.length() == 0) { return false; }
        if (s.length() == 1 || s.length() == 2) { return true; }

        s = s.toLowerCase(); // Assumption: case insensitive
        int[] codes = new int[128]; // Assumption: all ascii letters

        int letterCount = 0;
        for (int i = 0; i < s.length(); i++) {
            int code = s.charAt(i);
            if (code < 97 || code > 122) { continue; } // ignore non-letter
            codes[code]++;
            letterCount++;
        }
        boolean allowOdd = letterCount % 2 != 0 ? true : false;
        for (int i = 0; i < 128; i++) {
            if (codes[i] == 0) { continue;}
            if (codes[i] % 2 != 0){
                if (allowOdd){
                    allowOdd = false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    // Alternative solution: bit operation


    public static void main(String[] args) {
        System.out.println(isPalindromePermutation(null) == false);
        System.out.println(isPalindromePermutation("") == false);
        System.out.println(isPalindromePermutation("a") == true);
        System.out.println(isPalindromePermutation("a ") == true);
        System.out.println(isPalindromePermutation("aa") == true);
        System.out.println(isPalindromePermutation("ab") == true);
        System.out.println(isPalindromePermutation("accc") == false);
        System.out.println(isPalindromePermutation("Tact Coa") == true);
    }
}