package Day18_String;

import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {
       // Scanner input=new Scanner(System.in);
        Scanner input = new Scanner(System.in);
       // System.out.println("Please, enter a username");
        System.out.println("Please, enter a username");

        //String  user = input.next();
        String user = input.next();
       // user = user.toLowerCase().trim();
        user = user.toUpperCase().trim();
       // System.out.println("Please, enter a password");
        System.out.println("Please, enter a password");
       // String pass = input.next();
        String password = input.next();

       // if(pass.length()<5 || pass.contains(user)){
        if(password.length()<5 || password.contains(user)){
            System.out.println("password cannot be less than 5 characters");
        }else{
            System.out.println("Invalid password");

        //if(pass.length()<=5){
            //System.out.println("Password cannot be less than 5 characters");

        }
       // if(pass.contains(user)){
           // System.out.println("INVALID PASSWORD, USERNAME SHOULD NOR BE IN IT");

        }
        //else{
          //  System.out.println("Invalid password");

        }




