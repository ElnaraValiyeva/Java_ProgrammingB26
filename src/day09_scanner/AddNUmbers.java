package day09_scanner;
import java.util.Scanner;
public class AddNUmbers {
    public static void main(String[] args) {
        System.out.println("Enter a number 1");
        System.out.println("Enter a number 2");
        System.out.println("Enter a number 3");
        Scanner input = new Scanner(System.in);
        int num1 =input.nextInt();
        int num2 = input.nextInt();
        int num3= input.nextInt();
        System.out.println(num1 + num2 +num3);



    }
}
