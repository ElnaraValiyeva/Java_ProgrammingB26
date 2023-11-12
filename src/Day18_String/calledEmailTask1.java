package Day18_String;

import java.util.Scanner;

public class calledEmailTask1 {
    public static void main(String[] args) {
        /*

      Assume that email address is constructed by person's first name and followed by an underscore and last name.

      Write a program that can swap first name with last name in the email (Separated by an underscore).
      If the email doesn't contain an underscore print the given input email.

         Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = input.next();
        input.close();

        if(email.contains("_")){
            int end =email.indexOf('_');
            int start = end + 1;
            int fin = email.indexOf('@');

            String firstName = email.substring(0,end);
            String lastName = email.substring(start,fin);
            String domain = email.substring(fin);

            System.out.println(email);


        }else{
            System.out.println(email);
        }

    }
}
