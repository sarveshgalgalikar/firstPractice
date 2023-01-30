package challenges.classics;

public class ClosestPalindrome {
    public static void main(String[] args){
        System.out.println(nearestPalindromic("54"));
    }

    public static String nearestPalindromic(String n) {

        int s = Integer.parseInt(n);
        System.out.println("Value of s is " + s);
        int low = s - 1;
        int high = s + 1;

        while(isPalindrome(low) != true){
            low = low -1;
            System.out.println("Low number " + low);
        }

        while(!isPalindrome(high)){
            high = high + 1;
            System.out.println("high number " + high);
        }

        if((s - low) < (high - s)){
            String low_str = Integer.toString(low);
            return low_str;
        } else {
            String high_str = Integer.toString(low);
            return high_str;
        }

    }
    public static boolean isPalindrome(int s){
        int num = s;
        int remainder;
        int reversedNum = 0;
        if(num == 0){
            return true;
        }

        if(s < 0){
            return false;
        }
        while(num != 0){
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num/10;
        }

        if(s == reversedNum){
            return true;
        } else {
            return false;
        }
    }
}