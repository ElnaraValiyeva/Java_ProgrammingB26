package Day22_LoopWhile;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to atm");

        int validPin = 1234;
        int userPin;
        int attempts = 0;

        do {

            System.out.println("enter your pin");
              userPin = input.nextInt();
              attempts++;

        }while(attempts < 3 && validPin!=userPin);

        if (validPin == userPin){
            System.out.println("Logged in");
        }else{
            System.out.println("Locked out");
        }



    }
}
