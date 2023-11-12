package Day_29_Array;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBookExample {
    public static void main(String[] args) {
        /*
        Ask the user to enter their first name
Convert the name into a char array
print the first and last letter of the name
_____________________________________________


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your name");
        String str = input.nextLine();

        char [] newArray = str.toCharArray();
        System.out.println(Arrays.toString(newArray));

        System.out.println("First name: " + newArray[0]);
        System.out.println("Last name: " + (newArray[newArray.length-1]));



    }
}
