package Day19_java;

import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word");
        String word = input.nextLine();
        int len = word.length()/2;
        if(len % 2 == 0) {
            System.out.println(word.substring((len / 2) - 1, ((len/2) + 1)));
            //
        } else if (len % 2 !=0){
            System.out.println(word.substring((len/2),((len /2) + 2)));
        }


    }
    }

