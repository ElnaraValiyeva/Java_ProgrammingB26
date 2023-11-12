package day12_if_statements;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month");
        int monthnum = input.nextInt();
    //   int  monthnum=1;


        int monthNum = 1;
        boolean has31Days=monthNum == 1 || monthNum == 2|| monthNum==3||monthNum== 10;
        boolean has30Days= monthNum == 4||monthNum==6||monthNum==11;
        boolean has28Days=monthNum == 2;

        if(has31Days){
            System.out.println("Has 31 days");

        }else if(has28Days){
            System.out.println("Has a 28 days");
        }else if(has31Days){
            System.out.println("Has 31 days");
        }


}
}





