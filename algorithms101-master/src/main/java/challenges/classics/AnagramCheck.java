
package challenges.classics;
import java.util.Arrays;


//Step 1: We need to check if a word is an anagram
    //Step 2: then we identify the anagrams or permutions of how many ways a word can be arranged
    //Step 3: Print that anagram


public class AnagramCheck {
    public static void main(String[] args) {
        String word = "tint";
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String sortedWord = new String(chars);
        System.out.println("Sorted word: " + sortedWord);

        if (isAnagram(word, sortedWord)) {
            System.out.println(word + " is an anagram.");
        } else {
            System.out.println(word + " is not an anagram.");
        }

        printAllArrangements(chars, 0, chars.length - 1);
    }

    public static boolean isAnagram(String word1, String word2) {
        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();
        Arrays.sort(word1Chars);
        Arrays.sort(word2Chars);
        return Arrays.equals(word1Chars, word2Chars);
    }

    public static void printAllArrangements(char[] chars, int start, int end) {
        if (start == end) {
            System.out.println(new String(chars));
        } else {
            for (int i = start; i <= end; i++) {
                swap(chars, start, i);
                printAllArrangements(chars, start + 1, end);
                swap(chars, start, i);
            }
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}

