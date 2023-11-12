package day09_scanner;

import java.util.Scanner;

public class ProductName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the product name");
        String productName = input.nextLine();
        System.out.println("Please enter the price of the " + productName);
        double price = input.nextDouble();
        System.out.println("How many " + productName + "'s do you want to buy");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("What is the  full name for the order");
        String fullname = input.nextLine();
        double totalCost  = price * quantity;

        String order= fullname + ", your order for " + quantity + " " + productName +" 's has been placed.Your total is " + totalCost;
        System.out.println(order);








    }
}
