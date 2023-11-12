package Day27_NestedLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CountcharakterInString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the word");
        String str = input.nextLine();

        int endIndex = str.length();
        int count = 0;
        str += "  ";

        for (int i = 0; i < endIndex; i++) {

            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2))             {

                count++;

            }
        }

        System.out.println(count);

    }



}
