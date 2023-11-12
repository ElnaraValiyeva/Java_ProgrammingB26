package day16_review;

import java.util.Scanner;

public class theGame {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int minutes = input.nextInt();

        if(minutes >= 0 && minutes <= 90){

            if(minutes >=75){
                System.out.println("Game just getting started");

            }else if(minutes >= 60){
                System.out.println("Players are doing their best");
            }
        }
    }
}
