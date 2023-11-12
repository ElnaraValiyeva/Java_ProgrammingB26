package Day18_String;

import java.util.Locale;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        /*
         You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = input.next();

        System.out.println("Enter your password");
        String password = input.next();
        input.close();

        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            System.out.println("Incorrect username or password");
        }








    }

}
