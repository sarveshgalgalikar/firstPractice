package challenges.classics;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindTextInSentence1 {


    private int countText(String passage, String text) {

        if (passage == null || passage.length() == 0) {
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

        System.out.print("Enter the text you want to search in your message");
        String text = sc.nextLine();

        FindTextInSentence1 ftis = new FindTextInSentence1();
        System.out.println("The" + text + "appeared" + ftis.countText(passage, text) + "times");
    }
}

