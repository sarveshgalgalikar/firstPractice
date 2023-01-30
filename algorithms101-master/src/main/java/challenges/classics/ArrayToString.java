package challenges.classics;
import java.util.Arrays;

public class ArrayToString {

    public static void main(String args[]){
        String[] str = {"t", "r", "v", "d", "g"};
        String new_Str = "";
        for(int i=0; i<str.length; i++) {
            if (i != str.length-1) {
                new_Str = new_Str + str[i] + "|";
            } else new_Str = new_Str + str[i];
        }
        System.out.println("New String is " + new_Str);
    }
}
