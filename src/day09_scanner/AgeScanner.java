package day09_scanner;

 import java.util.Scanner;

public class AgeScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        byte yourAge= input.nextByte();
        System.out.println("Enter your favorit number");
        long favoritNumber = input.nextLong();
        System.out.println("Enter your  favorit book");
         String favoritBook= input.next();




    }
}
