package day23_loops;

import java.util.Scanner;

public class QuizLoopSpace {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the word");
        String word= input.nextLine().trim();
        String result = "";

        if(word.contains(" ")) {
            result = word.replace(' ', '_');
            for (int i = 0; i < result.length(); i++) {
                System.out.println(result.charAt(i) + " ");
            }

        }
        else {
            for(int i=0; i< word.length(); i++){
                    System.out.println(word.charAt(i) + " ") ;
            }








        }

    }
}

