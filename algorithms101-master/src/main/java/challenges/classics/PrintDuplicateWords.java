package challenges.classics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class PrintDuplicateWords {

    public static void main(String[] args) {
        String str = "This is my program to identify duplicate program which can be identify ied";
        String[] my_string = str.split(" ");
        System.out.println("This is my original string converted to array--- "+Arrays.toString(my_string));

        HashMap<String, Integer> my_hashmap = new HashMap<String, Integer>();
        for (String temp_str : my_string) {
            if (my_hashmap.get(temp_str) != null) {
                my_hashmap.put(temp_str, my_hashmap.get(temp_str) + 1);
            } else my_hashmap.put(temp_str, 1);
        }System.out.println("This is my hashmap --- " + my_hashmap);

        Iterator<String> it= my_hashmap.keySet().iterator();
        while(it.hasNext()){
            String temp = it.next();
            if(my_hashmap.get(temp)>1){
                System.out.println(temp + " " + my_hashmap.get(temp));
            }
        }
        if(str.isEmpty() == true){
            System.out.println("Empty Hashmap");
        }
    }
}