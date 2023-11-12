package Day15_SwitchStatement;

import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, Enter the month name");
        String month =scan.next();
        int day =0;

        switch (month){
            case  "January":
            case  "March":
            case   "May":
            case  "July":
            case  "August":
            case "October":
            case "December":
                day=31;
                System.out.println(" In this month has 31 days" );
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                day=30;
                System.out.println("In this month has 30 days");
                break;
            case "February":
                System.out.println("In this month has 28 days");
                break;
            default:
                System.out.println("Sorry, it is incorrect month name");





        }
    }
}

