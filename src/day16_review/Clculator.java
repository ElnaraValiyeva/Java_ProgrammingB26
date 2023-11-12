package day16_review;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Clculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        double numOne = input.nextDouble();
        System.out.println("Pick operators: + - / % ");
        String operator = input.next();
        System.out.println("Enter number two");
        double numTwo = input.nextDouble();

        double result=0;
        boolean validOperator = true;

        switch (operator){
            case "+":
                result = numOne + numTwo;
                break;
            case "-":
                result = numOne  - numTwo;
                break;
            case"*":
                result = numOne*numTwo;
                break;
            case"/":
                if(numTwo !=0){
                    result = numOne/numTwo;
                } else {
                    System.out.println("Cannot divide by 0");
                    validOperator=false;
                }
                break;

            case"%":
                if(numTwo !=0){
                    result = numOne % numTwo;
                } else {
                    System.out.println("Cannot remainder of 0");
                    validOperator= false;
                }
                break;

            default:
                System.out.println(operator + " is not a valid operators for this calculator");
                validOperator=false;
        }

        if(validOperator){
            System.out.println(numOne + " "  + operator + " " + numTwo + " =" + result);

        }

    }
}
