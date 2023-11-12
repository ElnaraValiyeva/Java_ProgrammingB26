package day09_scanner;
import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a salary");

        double salary= input.nextDouble();
        System.out.println("Enter hours weekly");
        int hoursWeekly= input.nextInt();
        double hourlyRate= salary/ (hoursWeekly * 52);

        System.out.println("With the salary of " + salary + "and working for " + hoursWeekly + " hours, your hourly rate is: $" + hourlyRate);

    }
}
