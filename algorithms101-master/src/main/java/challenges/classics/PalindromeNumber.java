package challenges.classics;

public class PalindromeNumber {

    public  static void main(String[] args){
        isPalindrome(-32434);
    }
    public static boolean isPalindrome(int x) {
        int num = x, reversedNum = 0, remainder;

        // store the number to originalNum

        if(num <0){
            System.out.println("Not a palindrome");
            return false;
        }
        // get the reverse of originalNum
        // store it in variable
        while (num != 0) {
            remainder = num %  10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (x == reversedNum) {
            System.out.println("Palindrome");
            return true;
        }
        else {
            System.out.println("Not Palindrome");
            return false;
        }
    }
}