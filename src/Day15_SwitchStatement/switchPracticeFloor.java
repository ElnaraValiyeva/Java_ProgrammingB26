package Day15_SwitchStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class switchPracticeFloor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome, Please enter a floor number in elevetor..\nFloor-1\nFloor - 2 \nFloor - 3 " +
                "\nFloor - 4");
        int floor= scan.nextInt();
        String company= "";
        boolean inValidFloor=true;

        switch(floor){

            case 1:
                System.out.println("Lobby " + "," + "StarBucks " + "," + "Amazon Pick Up ");
                break;
            case 2:
                System.out.println("NASA" + "," +  "Cydeo" + ","+  "Discover");
                break;
            case 3:
               company= "Uber, Lyft, Chase";
               break;
            case 4:
                company="Rooftop, Lounge";
                break;
            default:
                System.out.println(" Invalid Floor Selected");
                inValidFloor=true;
        }
        if(inValidFloor){
            System.out.println("Floor number which is you choose not working");
        }



    }


}
//  validOrder = false;
//        }
//
//        if(validOrder){
//            System.out.println("Your order for a " + size + " coffee is $" + price + " and has " + calories + " calories");
//