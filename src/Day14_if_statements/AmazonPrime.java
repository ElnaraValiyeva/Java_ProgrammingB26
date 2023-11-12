package Day14_if_statements;

import java.sql.SQLOutput;

public class AmazonPrime {
    public static void main(String[] args) {
        double price = 30.99;
        boolean hasPrime = true;

        if (hasPrime) {
            System.out.println("Eligible for 2 day shipping");
        } else {

            if (price >= 25) {
                System.out.println("Eligiable for regular shipping");

            } else {
                System.out.println("Not eligible for free shipping. Shipping fee: += 3.99");// price =price + 3.99;
            }
        }

    }
}