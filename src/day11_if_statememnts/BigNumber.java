package day11_if_statememnts;


import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 50;
        int num2 = 45;
        System.out.println( num1 + " is bigger than " + num2);
        System.out.println("Please enter first number");
        int number1=input.nextInt();
        System.out.println("Please enter second number");
        int number2 = input.nextInt();

        if(number1>number2){
            System.out.println(number1 + " is bigger");
        }else{
            System.out.println(number2 + " is bigger");
        }



    }
}
