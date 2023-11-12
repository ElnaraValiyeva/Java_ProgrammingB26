package Day15_SwitchStatement;

import java.util.Scanner;

public class hotelDaysSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many days they will stay at the hotel");
        int numberOfdDays = input.nextInt();
        System.out.println("How many people are staying in the room");
        int partySize = input.nextInt();
        double price = 0.0;
        String roomType = "";
        boolean validOrder = true;

        switch (partySize) {
            case 1:
                roomType = "single room";
                price = numberOfdDays * 100;
                break;
            case 2:
                roomType = "double room";
                price = numberOfdDays * 125;
                break;
            case 3:
            case 4:
                roomType = "large room";
                price = numberOfdDays * partySize * 150;
                break;
            case 5:
            case 6:
            case 7:
                roomType = "suite";
                price = numberOfdDays * 5000;
                break;
            default:
                System.out.println("Sorry we don't have any available rooms for that size party");
                validOrder = false;


        }
        if (validOrder){
            System.out.println("Booking information, Your room type: " + roomType + " for " + partySize + " you will be there " + numberOfdDays + " days, it cost you $ : " + price);
    }

}
}