package Day40_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drink");
        System.out.println(drinks);


        ArrayList<String> drinks2 = new ArrayList<>(drinks);
        System.out.println(drinks2);

        String [] alldrinks = {"coffee","tea", "energy drink","soda"};


        ArrayList<String> drinks3 =  new ArrayList<>(Arrays.asList(alldrinks));
        System.out.println(drinks);

        ArrayList<String> drinks4 = new ArrayList<>(Arrays.asList("coffee","tea", "energy drink","soda"));
        System.out.println(drinks4);
        System.out.println(drinks4.remove(2));

    }
}
