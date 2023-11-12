package day_61maps;

import java.sql.SQLOutput;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        //keys are Integer, and values are String

        Map<Integer, String> map = new java.util.HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(5, "five");
        System.out.println(map);



        System.out.println(map.get(10));

        String value = map.get(5);
        System.out.println(value);
        map.remove(1);
        System.out.println(map);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));

        System.out.println(map.containsValue("five"));
        System.out.println(map.containsValue("10"));

        map.put(null, "hello world");
        System.out.println(map);

        map.put(3,"March");
        System.out.println(map);



    }

}
