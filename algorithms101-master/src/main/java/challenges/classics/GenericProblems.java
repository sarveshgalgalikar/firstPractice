package challenges.classics;
import java.util.*;

public class GenericProblems {
    public static void main(String args[]){
        String str = "this is sarvesh and we are capitalizing first letter of every word";
        capitalizeLetters(str);
    }

    public static void capitalizeLetters(String str){
        String[] new_Str = str.split(" ");
        String[] capital = new String[new_Str.length];
        String final_Str ="";

        for(int i=0; i<new_Str.length; i++){
            String firstLetter = new_Str[i].substring(0,1).toUpperCase();
            String lastLetter = new_Str[i].substring(1);
            capital[i] = firstLetter + lastLetter ;
            if(i != new_Str.length-1){
                final_Str = final_Str + capital[i] + " ";
            } else {
                final_Str = final_Str + capital[i];
            }
        }
        System.out.println(final_Str);
    }




}
