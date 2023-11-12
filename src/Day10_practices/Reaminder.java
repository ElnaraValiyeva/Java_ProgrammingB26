package Day10_practices;
import java.util.Scanner;


public class Reaminder {
    public static void main(String[] args) {;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = input.nextInt();

        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 !=0;

        System.out.println(num + " isEven:  " + isEven);
        System.out.println(num + " isOdd: " + isOdd);





    }
}
