package day23_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String str = "racecar";

        // reverse the String

        String reverse = "";

        for(int i = str.length() -1;i>= 0; i--){

          reverse +=  str.charAt(i);

        }
        if(str.equals(reverse)){
            System.out.println("Polindrome");
        }else {
            System.out.println("Not Polindrome");
        }

        System.out.println(str.equals(reverse)? "Palindrome": "Not Palindrome");





    }

}

