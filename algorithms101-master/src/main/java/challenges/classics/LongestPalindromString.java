package challenges.classics;

public class LongestPalindromString {

    public static void main(String[] args){
        System.out.println(longestPalindromeCheck("abcbcba"));
        System.out.println(longestPalindromeCheck("bcbbcb"));
        System.out.println(longestPalindromeCheck("abcbcbdbdb"));

    }

    static int resultStart;
    static int resultLength;

    public static String longestPalindromeCheck(String s) {
        int str_length = s.length();
        if (str_length < 2) {
            return s;
        }

        for (int start = 0; start < str_length - 1 ; start++) {
            checkRange(s, start, start);
            checkRange(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }
    private static void checkRange(String s, int begin, int end) {
        /*first condition is to check if begin == end*/
      while(begin >= 0 && end < s.length()
                && s.charAt(begin) == s.charAt(end)){
            begin--;
            end++;
      }
      if(resultStart < (end - begin - 1)){
          resultStart = begin + 1;
          resultLength = end - begin -1;
      }
    }

}
