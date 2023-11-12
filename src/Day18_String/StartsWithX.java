package Day18_String;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        /*
        Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a
                    Input:
                        xcodex
                    Output:
                        acodex
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.next();

        input.close();

        if(word.charAt(0) == 'x'){
            word=word.replaceFirst("x", "a");

        }
        System.out.println(word);

    }
}
