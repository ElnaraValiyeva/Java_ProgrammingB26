package Day18_String;

import java.util.Scanner;

public class ReallyNeverMind {
    public static void main(String[] args) {

        /*
        Create a class named ReallyNeverMind. Ask the user to enter a word.
        if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.next();

        String lastChar = word.substring(word.length()-2);

        if(lastChar.equals("ly")){
            System.out.println("really");
        }else{
            System.out.println("Never mind");
        }
    }
}
