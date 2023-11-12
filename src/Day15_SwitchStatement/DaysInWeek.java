package Day15_SwitchStatement;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("What is a day number: 1-5");
         int num = input.nextInt();
         String day= "";

        switch (num){

            case 1:
               day= "Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day= "Friday";
                break;
            default:
                day="Not a valid day";



        }

    }
}
