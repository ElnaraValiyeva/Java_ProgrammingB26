package day09_scanner;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a year");
        int year= input.nextInt();
        boolean leapYear= year % 4==0;
        System.out.println("If the number is a leap year: " + leapYear);





    }
}
