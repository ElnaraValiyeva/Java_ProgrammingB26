package Day18_String;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the Product name: ");
        String multipleWords = input.nextLine();

        System.out.println("Enter the price: ");
        double price = input.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();
        input.nextLine();

        System.out.println("Enter their first name");
        String singleName = input.nextLine();
        double totalPrice = price * quantity;

        String result = (singleName +"," + "your order for " + quantity + "" + multipleWords + "has been places." + "." + "Your total is " + totalPrice);
        System.out.println(result);
    }
}
