package ch01arrysandstrings;

import java.util.ArrayList;

public class Utils {

    public static ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for (String w : words) {
            sentence.add(w);
        }
        for (String w : more) {
            sentence.add(w);
        }
        return sentence;
    }

    public static String joinWords(String[] words) {
        String sentence = "";
        for (String w : words) {
            sentence = sentence + w;
        }
        return sentence;
    }

    public static String joinWords02(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(w);
        }
        return sb.toString();
    }


}
