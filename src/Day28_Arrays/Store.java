package Day28_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String  [] items = {"Shoes", "Jacket", "Gloves", "Airpods", "IPod"};
        System.out.println("Which item are you looking for");
        String itemOflooking = scan.nextLine();
        boolean inStock = false;

        for(int i=0;i< items.length;i++) {

            if(items[i].equalsIgnoreCase("jackets")) {
                inStock=true;
                break;
            }
        }

        System.out.println(itemOflooking + (inStock ? " in stock" : " out of stock"));
    }
    }

