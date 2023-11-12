package Day15_SwitchStatement;

import java.util.Scanner;

public class starBucksSwitch {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("------Welcome To Book Shop------\n\tThere is a diffirent genre books.\nYou can choose one o them and get information about book...");
        System.out.println("1. Fantasy\n2. Detective\n3. Science Fiction\n4. Short Story");
        String genre = scan.next();
        int pageLength =0;
        double profit= 0;
        int sequels=0;
        int countries= 0;
        boolean infoIs=true;

        switch(genre){
            case"Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case "Detective":
                pageLength=350;
                profit=700_000;
                sequels=3;
                countries=45;
                break;
            case "Science Fiction":
                pageLength=720;
                profit= 900_500;
                sequels= 4;
                countries= 30;
                break;
            case "Short Story":
                pageLength=150;
                profit=300_000;
                sequels= 1;
                countries= 40;
                break;
            default:
                System.out.println("Invalid genre");
                infoIs=false;

        }
        if (infoIs) {
            System.out.println("Here is the summary: The " + genre + " has " + pageLength + " pages, " + sequels + " sequels and it is published in " + countries + " countries.\nThe profit is $" + profit + ".");


    }
    }
}

