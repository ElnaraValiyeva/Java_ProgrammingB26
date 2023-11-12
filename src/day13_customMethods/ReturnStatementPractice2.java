package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {

    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();

        if( number < 1 || number>7){
            System.out.println("Invalid Number: " + number);
            return;// exit the main number
        }

        System.out.println((number==1)? "Monday": (number==2)? "Tuesday" :(number==3)? "Saturday" : "Sunday") ;

    }
}
