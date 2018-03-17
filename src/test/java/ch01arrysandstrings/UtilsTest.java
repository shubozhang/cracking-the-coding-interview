package ch01arrysandstrings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UtilsTest {
    private static String[] words = {"Cracking", "The"};
    private static String[] more = {"Coding", "Interview"};
    private static String[] expected = {"Cracking", "The", "Coding", "Interview"};
    private static String joinedString01 = "CrackingThe";
    private static String joinedString02 = "CodingInterview";

    @Test
    public void merge() {
        ArrayList<String> sentence = Utils.merge(words, more);
        assertTrue(sentence.containsAll(Arrays.asList(expected)));
    }

    @Test
    public void joinWords() {
        assertTrue(Utils.joinWords(words).equals(joinedString01));
    }

    @Test
    public void joinWords02() {
        assertTrue(Utils.joinWords02(more).equals(joinedString02));
    }
}