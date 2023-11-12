package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice {

    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'B' || grade == 'C' || grade == 'D';

        if(!isValid){
            System.out.println("Invalid grade");
            return;
        }

        System.out.println( (grade == 'B')? "Excellent" :(grade=='C')? "Great job" :(grade == 'D')? "Passed" : "Failed" );
    }

}
