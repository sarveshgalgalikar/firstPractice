package challenges.classics;

import java.util.Arrays;
import java.util.HashMap;

public class CharacterCounterForLoop {
        public static void main(String args[]) {
            String mystring = "This is my first string";
            int counter =0;

            HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
            /**
            if (my_string.isEmpty()==true) {
                System.out.println("Empty String");
            }**/
            String[] new_string = mystring.split(" ");
            System.out.println(Arrays.toString(new_string));


            /**
            for(int i =0; i<mystring.length(); i++){
                char c = mystring.charAt(i);
                hashmap.put(c,i);
            }

            System.out.println(hashmap);**/
        }
    }

