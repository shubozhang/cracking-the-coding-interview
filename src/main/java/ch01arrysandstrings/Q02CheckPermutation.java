package ch01arrysandstrings;

import java.util.Arrays;

public class Q02CheckPermutation {

    // This implementation is practical, but not efficient
    public static boolean isPermutation(String s1, String s2){
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() == 0 || s2.length() == 0){
            return false;
        }

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        boolean res = Arrays.equals(chars1, chars2);
        return res;
    }

    public static boolean isPermutation02(String s1, String s2){
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() != s2.length()){
            return false;
        }
        int[] letters = new int[128];
        for(int i = 0; i < s1.length(); i++){
            int letter = s1.charAt(i);
            letters[letter]++;
        }
        for (int i = 0; i < s2.length(); i++){
            int letter = s2.charAt(i);
            if (letters[letter] == 0 || --letters[letter] < 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPermutation(null, "A") == false);
        System.out.println(isPermutation("B", null) == false);
        System.out.println(isPermutation("", "") == false);
        System.out.println(isPermutation("123", "312") == true);
        System.out.println(isPermutation("0", "0") == true);

        System.out.println(isPermutation02(null, "A") == false);
        System.out.println(isPermutation02("B", null) == false);
        System.out.println(isPermutation02("", "") == false);
        System.out.println(isPermutation02("123", "312") == true);
        System.out.println(isPermutation02("0", "0") == true);
    }
}