package Day18_String;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String full_name = input.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your Street name ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName =input.nextLine();

        System.out.println("Enter your state name");
        String stateName =input.nextLine();






        System.out.println();
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("stateName = " + stateName);








    }
}
