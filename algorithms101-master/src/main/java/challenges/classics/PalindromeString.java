package challenges.classics;

public class PalindromeString {

    public static void main (String[] args){
        String str = "0101t10101";
        String new_str = "";

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            new_str = c + new_str;

        }

        System.out.println("Original String " + str);
        System.out.println("Reversed String " + new_str);

        if (str.equals(new_str)) {
            System.out.println("We've found a Palindrome!");
        } else System.out.println("Not a palindrome");

    }
}
