package Day18_String;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String middleChar = input.next();
        input.close();

        if(middleChar.length() == 3){
            if (middleChar.charAt(1) == 'a')
            System.out.println("Cool word");

    }else{
            if(middleChar.length() > 3){
                System.out.println("Long");
            }else{
                System.out.println("word is short");
            }
        }
}}
