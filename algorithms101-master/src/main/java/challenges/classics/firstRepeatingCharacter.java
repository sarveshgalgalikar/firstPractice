package challenges.classics;

import com.sun.org.apache.xml.internal.utils.SystemIDResolver;
import java.util.HashMap;

public class firstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "yygygjygj";
        HashMap<Character, Integer> firstRepeating = new HashMap<Character, Integer>();
        for (int i =0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(firstRepeating.containsKey(c)==true){
                System.out.println("We've found repeating character is ("+c+")");

            } else firstRepeating.put(c, i);
        }
        if(firstRepeating.isEmpty()==true){
            System.out.println("Empty hashmap");
        }
        System.out.println(firstRepeating);
    }
}