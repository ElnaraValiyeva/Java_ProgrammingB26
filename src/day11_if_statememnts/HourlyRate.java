package day11_if_statememnts;
import java.sql.SQLOutput;
import java.util.Scanner;

public class HourlyRate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" What is your hourly rate");
        double hourlyRate = scan.nextDouble();
        System.out.println("What is your hourly work number");
        double hoursWork = scan.nextDouble();
        double netPayment = hourlyRate*hoursWork;
        double overtimePayment, totalPayment;

        if(hoursWork<=40){
            System.out.println("Your net pay : "+ netPayment );
        }
        if( hoursWork>40){
            overtimePayment=hoursWork-40;
            overtimePayment = overtimePayment + (40*hourlyRate);
            netPayment = overtimePayment + (40* hourlyRate);
            System.out.println(" Your net payment in this month: $ " + netPayment);
        }else{
            netPayment=(hoursWork*hourlyRate);
            System.out.println(" Yours net payment in this month: " + netPayment);
        }

    }

}
