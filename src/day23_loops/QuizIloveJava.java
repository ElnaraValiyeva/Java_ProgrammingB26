package day23_loops;

import java.util.Scanner;

public class QuizIloveJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().trim();

        int firstSpace = word.indexOf(' ');
        int secondSpace = word.lastIndexOf(' ');
        String middle = word.substring(firstSpace+1, secondSpace);
        String reverse = "";
        String firstWord = word.substring(0,firstSpace);
        String thirdWord = word.substring(secondSpace+1,word.length());

        for (int i = middle.length()-1; i >= 0; i--) {
            reverse += "" + middle.charAt(i);

        }
        System.out.println(firstWord + " " +  reverse + " " + thirdWord);





    }
}
/*
i Love Java

    }




 */