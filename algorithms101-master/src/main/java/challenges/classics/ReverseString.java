package challenges.classics;

import static java.lang.System.*;

//CommentNew

public class ReverseString {

    public static void main(String[] args){
        String str = "This is Sarvesh Galgalikar";
        reversedStringInplace(str);
        reversedStringWords(str);
        reverseStringUsingStringBuilder(str);
    }

    private static void reversedStringInplace(String str) {
        String new_str="";
        for(int i = str.length()-1; i >= 0; i--){
           //  char c = str.charAt(i);
             new_str = new_str + str.charAt(i);
        }
        System.out.println("ReversedStringInplace is as follows ---> "+new_str);
    }

    private static void reversedStringWords(String str) {

        String[] reverse_arr = str.split(" ");
        String reversedStr = "";
        for (int i = reverse_arr.length - 1; i >= 0; i--) {
            reversedStr = reversedStr + " " + reverse_arr[i];
        }
        out.println("ReversedString is as follows --->" + reversedStr);
    }


    private static void reverseStringUsingStringBuilder(String str){
        //time complexity = O(n) --> from 0 to n/2 where 2 is constant and can be ingnored
        StringBuilder originalString = new StringBuilder(str);

        for(int i = 0; i < originalString.length()/2; i++) {

            int frontIndex = i;
            int backindex = originalString.length() - 1 - i;

            char frontChar = originalString.charAt(frontIndex);
            char backChar = originalString.charAt(backindex);

            originalString.setCharAt(frontIndex, backChar);
            originalString.setCharAt(backindex, frontChar);
        }
        System.out.println(originalString);

    }
}
