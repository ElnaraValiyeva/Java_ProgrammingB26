package day23_loops;

import java.util.Scanner;

public class asciiLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        int ascii =0;


        for(int i =0; i<word.length(); i++){
            System.out.println(0 + word.charAt(i));



        }
    }


}
