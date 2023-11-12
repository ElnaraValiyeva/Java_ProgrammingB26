package day11_if_statememnts;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is a   first number?");
        int num1 = input.nextInt();
        System.out.println("What is a  second number?");
        int num2 = input.nextInt();
        System.out.println("What is a third  number?");
        int num3 = input.nextInt();

        if((num1<num2 && num1<num3) ||(num2<num1 && num2<num3)|| (num3<num1 && num3<num2)) {
            System.out.println("The smaller number " + num1 );
        }









    }
}
