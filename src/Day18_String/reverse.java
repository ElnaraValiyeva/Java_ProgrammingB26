package Day18_String;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word");
        String word = input.next();

        input.close();

        String result = "";

        if(word.length() == 5){
            result+=word.charAt(4);
            result+=word.charAt(3);
            result+=word.charAt(2);
            result+=word.charAt(1);
            result+=word.charAt(0);
        }else if(word.length() > 5){
            result = "Too long";
        }else{
            result = "Too short";
        }

        System.out.println(result);

    }
}
