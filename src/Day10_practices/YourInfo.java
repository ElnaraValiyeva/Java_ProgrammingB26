package Day10_practices;
import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Print your book :");
        String book = in.nextLine();
        System.out.print("What is your age? ");
        byte age = in.nextByte();
        System.out.print("What is your favorite number? ");
        long favoriteNumber = in.nextLong();


    }
}
