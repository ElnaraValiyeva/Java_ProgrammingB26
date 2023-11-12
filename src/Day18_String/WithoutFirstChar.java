package Day18_String;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        /*
        Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word");
        String firstWord = input.nextLine();

        System.out.println("Enter the second word");
        String secondWord = input.nextLine();

        input.close();

        System.out.println(firstWord.substring(1) + secondWord.substring(1));





    }
}
