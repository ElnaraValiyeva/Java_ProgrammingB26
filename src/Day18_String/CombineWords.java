package Day18_String;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        /*
        Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstWord = input.next();

        System.out.println("Enter second word");
        String secondWord = input.next();

        input.close();

        int lastIndex=firstWord.length()-1;

        char fWLC = firstWord.charAt(lastIndex);

        char lWFC = secondWord.charAt(0);
        String result = "";

        if(fWLC==lWFC){
            result =firstWord.substring(0,lastIndex) + secondWord;
        }else{
            result= firstWord + secondWord;
        }
        System.out.println(result);




    }
}
