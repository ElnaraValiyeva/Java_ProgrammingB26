package Day18_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your account number");
        String num = input.next();
        int len = num.length();
        boolean isValid = (num.startsWith("2") && len == 7) || (num.startsWith("5") && len == 10);
        boolean inValid = num.isEmpty();

        if (inValid) {
            System.out.println("Empty input given");
        } else if (num.startsWith("2")) {
            if (len == 7) {
                System.out.println("Invalid " + len + " account number");
            }

            if (num.startsWith("5")) {
                if (len == 10) {
                    System.out.println("Valid " + len + "account");
                } else {
                    System.out.println("Invalid " + len + "account");
                }
                System.out.println("Please enter correct number");
            }
        }
    }
}


