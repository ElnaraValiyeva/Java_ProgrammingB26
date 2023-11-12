package Day15_SwitchStatement;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the vending machine.Please select one of the following:\n\tDrinks\n\tSnacks\n\t\n\tGum");
         String selection = input.next();
         String item = "";

         switch (selection){

             case "Drinks":
                 System.out.println("You choose drinks: press a number:\n\t1)Water\n\t2)Soda\n\t3)juice");
                 int drinkNumber = input.nextInt();

                 if(drinkNumber ==1){
                     item = "water";
                 } else if(drinkNumber ==2){
                     item= "soda";
                 }else if(drinkNumber == 3){
                     item= "juice";
                 }

                 break;
             case "Snaks":
                 System.out.println("You choose snaks a number:\n\t4)Chips\n\t5)Cookies");
                 int snackNumber = input.nextInt();

                 if( snackNumber == 4){
                     item = "chips";
                 }else if(snackNumber ==5){
                     item = "cookies";
                 }
                 break;

             case "Gum":
         }
        System.out.println("Vending ......" + item);
    }
}
