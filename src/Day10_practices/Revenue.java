package Day10_practices;
import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of the item");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        double revenue = price * quantity;
        System.out.println("The revenue is: $" + (price * quantity));


    }
}
