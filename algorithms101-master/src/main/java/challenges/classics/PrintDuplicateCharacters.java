package challenges.classics;

import java.util.HashMap;
import java.util.Iterator;

public class PrintDuplicateCharacters {

    public static void main(String[] args) {
        String str = "fgfsdfdsf";
        HashMap<Character,Integer> my_hashmap = new HashMap<>();
        for (int i =0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (my_hashmap.get(c) != null) {
                my_hashmap.put(c, my_hashmap.get(c) + 1);
            } else my_hashmap.put(c, 1);
        }
        Iterator<Character> it = my_hashmap.keySet().iterator();
        while(it.hasNext()){
            char c2 = it.next();
            if(my_hashmap.get(c2) > 1){
                System.out.println(c2 + "  " + my_hashmap.get(c2));
            }
        }
        if(str.isEmpty()){
            System.out.println("Empty Hashmap");
        }
    }
}
