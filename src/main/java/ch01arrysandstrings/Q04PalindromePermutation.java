package ch01arrysandstrings;

public class Q04PalindromePermutation {

    public static boolean isPalindromePermutation(String s){
        if (s == null || s.length() == 0) { return false; }
        if (s.length() == 1) { return true; }
        return false;
    }
}
