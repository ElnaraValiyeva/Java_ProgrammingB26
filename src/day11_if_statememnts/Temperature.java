package day11_if_statememnts;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the discount");
        double discount = scan.nextDouble();

        if(discount>=50){
            System.out.println("I will buy everything");

        }else{
            System.out.println("Not buy nothing");
        }



    }
}
