package day23_loops;

import java.util.Scanner;

public class Maxandmin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -213456778;
        int min = 213456778;

        int n=0;

        while(n < 5){
            n++;

            System.out.println("Enter an number");
            int number = input.nextInt();


            if(number> max){
                max = number;

            }
            if(number < min){
                min = number;
            }
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);


    }
}
