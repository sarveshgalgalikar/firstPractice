//This problem checks if string 1 is an anagram of string 2

package challenges.classics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
// Adding two iAnandram function that explains two of identifying wether a string or integer is anagram or not

public class Anagram {
    public static void main (String args[]){
        String str1 = "Sarvesh";
        String str2 = "varsseh";
        System.out.println(isAnagram2(str1,str2));
        System.out.println(isAnagram2(str1,str2));
        System.out.println(isAnagram3(str1,str2));


    }
    //This is first way of identifying if string 2 is an anagram of string1
    public static boolean isAnagram1(String text1, String text2) {
        // Map 1
        HashMap<String, Integer> map1 = map(text1);
        // Map 2
        HashMap<String, Integer> map2 = map(text2);
        // Compare letters and frequency of characters in Maps
        return map1.equals(map2);
    }
/**
         private static HashMap<String, Integer> map(String text) {
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            char[] chars = text.toCharArray();
            // Loop through and build the map one letter at a time...
            for (int i=0; i < chars.length; i++) {
                 String letter = String.valueOf(chars[i]);
                // if we already have, just increment
                if (map.containsKey(letter)) {
                    Integer currentCount = map.get(letter);
                    map.put(letter, currentCount + 1);
                } else { // else add
                    map.put(letter, 1);
                }
            }
        return map;
    }
**/

    private static HashMap<String, Integer> map(String text) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        // Loop through and build the map one letter at a time...
        for (int i=0; i < text.length(); i++) {
            char c = text.toLowerCase().charAt(i);
            // if we already have, just increment
            if (map.containsKey(c)) {
                map.put(String.valueOf(c), map.get(c) + 1);
            } else { // else add
                map.put(String.valueOf(c), 1);
            }
        }
        return map;
    }


    //this is second way of identifying the anagram
    public static boolean isAnagram2(String text1, String text2) {
        if(text1.length() != text2.length()) return false;

        char[] chars1 = text1.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = text2.toLowerCase().toCharArray();
        Arrays.sort(chars2);
        // Note: Don't do ==
        return Arrays.equals(chars1, chars2);
    }


    /**
    //This is the third way of identifying if two strings are anagrams of each other
    //The way we do it is we take first string, we take the count of the occurrence of the character
     then we check for the same character if it exists is  second string, if it does exist, then decrement the count
     finally the character count should be zero,
     s = anagram, t = naaagrm
     **/

    public static boolean isAnagram3(String s, String t){
        int[] char_count = new int[26];
        if(s.length() != t.length()) return false;

        for(int i=0; i<s.length(); i++){
            char_count[s.toLowerCase().charAt(i)-'a']++;
            char_count[t.toLowerCase().charAt(i)-'a']--;
        }
        for(int count : char_count){
           if(count != 0){
               return false;
           }
        }
        return true;
    }
}
