package Day18_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first String of text");
        String str1 = input.next();

        System.out.println("Enter the second String of text");
        String str2 = input.next();

        input.close();

        if(str1.length() > str2.length()){
            System.out.println("The longest word str1");
        }else if(str2.length() > str1.length()){
            System.out.println("The longest word str2");
        }else{
            System.out.println("Both have a same lenght");
        }
    }
}
