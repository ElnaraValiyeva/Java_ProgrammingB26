package Day18_String;

import java.util.Scanner;

public class FirstLastCharactersOfSentences {
    public static void main(String[] args) {
        /*
    write a program that asks user to enter a sentence.
    then print the first & last characters of the sentence

 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.next();
        input.close();

        char firstChar = sentence.charAt(0),
                lastChar = sentence.charAt(sentence.length()-1);

        String result = firstChar + "" + lastChar;
        System.out.println(result);



    }
}
