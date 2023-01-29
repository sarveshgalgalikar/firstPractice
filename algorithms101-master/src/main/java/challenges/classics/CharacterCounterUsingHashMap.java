package challenges.classics;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounterUsingHashMap {


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //Declaring the Scanner object
        System.out.println("Input a string"); //Printing what is being asked to input
        String inputString = sc.nextLine(); // taking the input from user in commandline
        // replacing the whitespaces if we do not want them in the  output
        //remove this line and use normal string input in next line if we want spaces part of the calculation of count
        String replacedString = inputString.replaceAll("\\s", "");

        //Declare the hashmap
        HashMap<Character, Integer> map = new HashMap<>();

        //Using the HashMap in the for loop, we will check if the character exists in HashMap as keys
        //If it does, increase the value by 1
        //If the key doesn't exist, then add the key to the map with value 1

        for(int i=0; i<replacedString.length(); i++){
            char c = replacedString.charAt(i); //get the character from the string
            if (map.containsKey(c)){ //check if the key with the character exists in the map
                map.put(c, map.get(c)+1); // increment the value by 1 if the key exists
            } else {
                map.put(c, 1); // else add the key to the map with value as 1
            }
        }
        System.out.println("print the map " + map); //print the map
    }
}


