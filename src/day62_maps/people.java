package day62_maps;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class people {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", "JAMES");
        map.put("LAST_NAME", "BOND");
        map.put("BATCH", "7");

        System.out.println(map);

        List< Map<String,String>> list = new ArrayList<>();

        list.add(map);
        list.add(makeMap("Ella", "Valiyeva", "26"));

        System.out.println(list.get(1).get("FIRST_NAME"));
        System.out.println(list.get(1).get("Last_NAME"));

        for(Map<String, String> each: list) {
            System.out.println(each);

        }

            // Go through all the people and print all the first names

            for(Map<String, String> each: list){
                System.out.println(each.get("FIRST_NAME")); // each is each map, the maps are the people's information
            }

            System.out.println();

            // Find all the people who are in Batch 20 or above

            for(Map<String, String> each: list){
                if(Integer.parseInt(each.get("BATCH")) >= 20) {
                    System.out.println(each.get("FIRST_NAME"));
                }
            }

            System.out.println();

            // Print the information of the last person in my List
            // the first get call is the List method, to get the element based on the index
            // the second get method is from the map, to get the value based on the key
            System.out.println("First name: " + list.get(list.size() - 1).get("FIRST_NAME"));
            System.out.println("Last name: " + list.get(list.size() - 1).get("LAST_NAME"));
            System.out.println("Batch name: " + list.get(list.size() - 1).get("BATCH"));

        }



    public static Map<String, String> makeMap (String ... values){
        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", values[0]);
        map.put("LAST_NAME", values[1]);
        map.put("BATCH", values[2]);
        return map;
    }

}
