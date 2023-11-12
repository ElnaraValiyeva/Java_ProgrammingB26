package day24_loopPractice;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 words");
        String str = input.nextLine();

        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");

        String middleWord =str.substring(firstSpace + 1, lastSpace);
        String reverse = "";

        for(int i = middleWord.length()-1; i >=0; i--) {
            reverse += middleWord.charAt(i);

        }
        System.out.println(str.substring(0, firstSpace + 1)+ reverse + str.substring(lastSpace));


}


    }

