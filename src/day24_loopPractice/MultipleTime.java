package day24_loopPractice;

import java.util.Scanner;

public class MultipleTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.nextLine();
        System.out.println("How many time");
        int repeat = input.nextInt();

        for(int i =0; i < repeat; i++){
            word += word.charAt(word.length());
        }
        System.out.println(word);
    }


}

