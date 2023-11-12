package Day15_SwitchStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hello, What size drink you want? ");
        String size= input.next();
        double price= 0;
        int calories =0;
        boolean validOrder = true;

         switch(size){

             case "tall":
                 price =2.50;
                 calories = 100;
                 break;
             case"grande":
                 price = 4.00;
                 calories=150;
                 break;
             case "venti":
                 price = 4.50;
                 calories = 200;
                 break;
             default:
                 System.out.println("We dont that size");
                 validOrder = false;


         }
         if(validOrder){
        System.out.println("We  have  "  + size + " price is " + price + "and calories is "  + calories);
        validOrder=true;


    }
    }
}


