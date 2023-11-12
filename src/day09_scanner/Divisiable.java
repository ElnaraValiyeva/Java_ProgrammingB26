package day09_scanner;
import java.util.Scanner;

public class Divisiable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter a number");
        int num= input.nextInt();
        System.out.println("Divisable");
        boolean IsItDivisable1= num%2 ==0;
        boolean IsItDivisable2 = num%3 ==0;
        boolean IsItViviable3 = num%5==0;

        System.out.println(IsItDivisable1);
        System.out.println(IsItDivisable2);
        System.out.println(IsItViviable3);



    }
}
