package challenges.classics;

import static java.lang.System.*;

//Comment22

public class ReverseString {

    public static void main(String[] args){
        String str = "This is Sarvesh Galgalikar";
        reversedStringInplace(str);
        reversedString(str);
    }

    private static void reversedStringInplace(String str) {
        String new_str="";
        for(int i = str.length()-1; i >= 0; i--){
             char c = str.charAt(i);
             new_str = new_str + c;
        }
        System.out.println("ReversedStringInplace is as follows ---> "+new_str);
    }

    private static void reversedString(String str) {

        String[] reverse_arr = str.split(" ");
        String reversedStr = "";
        for (int i = reverse_arr.length - 1; i >= 0; i--) {
            reversedStr = reversedStr + " " + reverse_arr[i];
        }
        out.println("ReversedString is as follows --->" + reversedStr);
    }
}
