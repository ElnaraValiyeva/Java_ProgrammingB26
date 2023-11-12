package Day26_nested_loops;

import java.util.Scanner;

public class VowelNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a  word");
        String word=input.nextLine();

        for(int i =0; i<word.length(); i++){

            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'|| word.charAt(i) == 'o'||word.charAt(i) == 'u'){
                System.out.print("" + word.charAt(i));
            }

        }
    }
}
