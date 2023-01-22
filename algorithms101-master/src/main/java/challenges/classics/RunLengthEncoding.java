package challenges.classics;

public class RunLengthEncoding {
/*
    public static void main(String[] args) {

        String inputString = "aaabbccccda";
        String outputString = "";

        int count = 1;
        for (int i = 0; i < inputString.length(); i++) {

            // resetting to 1 for every new character (counting current character).
            count = 1;
            while (i < inputString.length() - 1 && inputString.charAt(i) == inputString.charAt(i + 1)) {
                count++;
                i++;
            }
            outputString = outputString + count+ inputString.charAt(i) ;
        }
        System.out.println("Input data string : " + inputString);
        System.out.println("Output data string after applying data compression technique : " + outputString);

    }
 */


    public static void main(String[] args){
        String inputString = "aaaabbbbsbbbaa";
        String outputString = "";

        int count = 1;

        for(int i = 0; i < inputString.length()-1; i++){
            count = 1;

            while (i < inputString.length() -  1 && (inputString.charAt(i) == inputString.charAt(i + 1))){
                count ++;
                i++;
            }
            outputString = outputString + count + inputString.charAt(i);
        }


        System.out.println("Origina Input String" + " " + inputString);
        System.out.println("New out put string with encoding:" + " " + outputString );
    }

}