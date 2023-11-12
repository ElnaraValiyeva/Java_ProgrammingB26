package Day18_String;

import java.util.Locale;
import java.util.Scanner;

public class Inital {
    public static void main(String[] args) {
        /*
        write a program that can return the initials of the user

            ex:
                cydeo
                school

            output:
                C.S
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName = input.next();

        System.out.println("Enter the last name");
        String lastname = input.next();

        input.close();

        char firstInitials = firstName.toUpperCase().charAt(0);
        char lastInitials = lastname.toUpperCase().charAt(0);

        String result = firstInitials + "" + lastInitials;

        System.out.println(result);

    }
}
