package day62_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Map<String, Double> store = new HashMap<>();
        store.put("Water", 1.5);
        store.put("Bread", 2.5);
        store.put("Banana", 0.99);
        store.put("Apple", 2.35);

        System.out.println("Store Inventory: ");
        
     //   for(String key : store.keySet()){

       // System.out.println("Item: " + key +  " for $" + store.get(key));

        Scanner input = new Scanner(System.in);
        System.out.println("What item do you want?");
        String item = input.nextLine();

        System.out.println(store.containsKey(item) ? item + " is in stock for $" + store.get(item) : "Not available in this store");

    }
    }


