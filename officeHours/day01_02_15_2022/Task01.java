package day01_02_15_2022;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Please enter second number: ");

        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int average = sum / 2;


        int max= 0;
        int min = 0;
        if(number1 > number2){
            max= number1;
            min = number2;
        }else{
            max = number2;
            min = number1;
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("sum: " + sum);



    }
}
