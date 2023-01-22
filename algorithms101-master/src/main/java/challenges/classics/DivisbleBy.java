package challenges.classics;

public class DivisbleBy {

    public static void main (String[] args){
        DivisbilityCheck(48);
    }
    public static void DivisbilityCheck(int a){
      if (a%32==0) {
            System.out.println("ANIMAL");
        } else if (a%16==0){
          System.out.println("ANIM");
      } if (a%8==0){
            System.out.println("AN");
        }
    }
}
