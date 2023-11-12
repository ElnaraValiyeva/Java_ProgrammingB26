package MyLibrary;

import java.util.Scanner;

public class CurConventor {
    public static void main(String[] args) {
        /*
        create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type

1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

         */


        System.out.println(currencyType("euro",0.91));




    }

    public static double currencyType (String currencyAmount, double dollar){

        switch (currencyAmount){
            case "euro":
                return dollar * 0.91;
            case "yen":
                return dollar * 121.03;
            case "lira":
                return dollar * 14.85;
            case "won":
                return dollar * 1.217;
            case "rupee":
                return dollar * 181.45;
            default:
                return 0;



    }



    }


}
