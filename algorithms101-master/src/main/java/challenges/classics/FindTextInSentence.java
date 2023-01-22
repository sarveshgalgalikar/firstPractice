package challenges.classics;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindTextInSentence {


    private int countText(String passage, String text) {

        if (passage == null || passage.length() == 0 || text.length() == 0) {
            return 0;
        }

        Map<String, Integer> my_map = new HashMap<>();

        for (String s : passage.split(" ")) {
            my_map.put(s, my_map.getOrDefault(s, 0) + 1);
        }

        return my_map.get(text);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter your message");
        String passage = sc.nextLine();

        System.out.print("Enter the text you want to search in your message ");
        String text = sc.nextLine();

        FindTextInSentence ftis = new FindTextInSentence();
        System.out.println("The text " + "(" + text + ")" + " appeared " + ftis.countText(passage, text) + " times");
    }
}




/*package challenges.classics;


import java.util.HashMap;
import java.util.Iterator;

public class FindTextInSentence {
    public static void main(String[] args){
        String str = "This is Thomas jefferson and I am currently talking to Prathamesh";
        String search_text = "This"

        HashMap<String, Integer> my_map = new HashMap<String, Integer>();
        String[] str_arr = str.split(" ");

        for(String s : str_arr){
            my_map.put(my_map.getOrDefault(s      , 0) + 1);
        }

        return my_map.get(str

    }
}
*/