package Day_13_03_22;

import java.util.Arrays;
import java.util.Scanner;

public class StrongPassword {
    /*

    Task 5: Write a method that can verify if a password is a strong password. Characteristics of strong passwords are:
                       1.1 Password must be at least have 8 characters long, and should not contain space
                       1.2 PassWord should at least contain one upper case letter
                       1.3 PassWord should at least contain one lower case letter
                       1.4 Password should at least contain one special characters
                       1.5 Password should at least contain a digit

     */
    public static String strongPassword (String password){

        int upper = 0;
        int lower = 0;
        int number = 0;
        int character = 0;
        for( int i = 0; i < password.length();i++){
            boolean ifupper = Character.isUpperCase(password.charAt(i));
            boolean iflower = Character.isLowerCase(password.charAt(i));
            boolean ifnumber = Character.isDigit(password.charAt(i));
            boolean ifcharacter = !ifupper && !iflower && !ifnumber && password.charAt(i) !=' ';

            if(ifupper){
                upper++;
            }else if(iflower){
                lower++;
            }else if(ifnumber){
                number++;
            }else if(ifcharacter){
                character++;
            }
        }



        boolean validLength = password.length() >=8;
        boolean oneUpper = upper > 0;
        boolean oneLower = lower > 0;
        boolean oneNumber = number > 0;
        boolean certainCharacter = character > 0;
        boolean validPassword = validLength && oneUpper && oneLower && oneNumber && certainCharacter;
        return validPassword? "You successfully logged in.":"Your password is invalid.";
    }








    public static void main(String[] args) {
        int [] sortNumber = {34,1,89,56,45};
        Arrays.sort(sortNumber);
        System.out.println(Arrays.toString(sortNumber));
    }



    }



