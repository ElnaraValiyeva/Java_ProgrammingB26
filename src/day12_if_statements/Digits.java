package day12_if_statements;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

       int number = 565;
        int digitnumber1 = number;
        int digitnumber2 = number % 10;
        int digitnumber3 = number / 10;
        int totaldigitnumber = (digitnumber2 + digitnumber3);
        System.out.println(totaldigitnumber);
    }


}
