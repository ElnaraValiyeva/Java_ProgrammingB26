package Day18_String;

import java.util.Scanner;

public class SpeedCheckheck {

    public static void main(String[] args) {

        int speedLimit = 55;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current speed");
        int currentSpeed = scan.nextInt();

        scan.close();// not need scanner

        int overLimitSpeed = currentSpeed - speedLimit;

        if(overLimitSpeed > 0){
            System.out.println("You're driving 50 mph over the limit. Slow down!");
        }


    }

}
