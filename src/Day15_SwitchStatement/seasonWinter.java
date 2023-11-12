package Day15_SwitchStatement;

import java.util.Scanner;

public class seasonWinter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Can you say what season it is ? ");

        int day= scan.nextInt();
        boolean infoIs=true;

        switch (day){
            case 12:
            case 1:
            case 2:
                System.out.println("It is winter, so wear coat, gloves and a hat");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It is spirng, so wear just jacket");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is summer, so you can wear a dresser");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is fall, so wear a litle harm");
                break;



        }


        }

    }

