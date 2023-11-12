package day_61maps;

import java.util.*;
import java.util.HashMap;

public class AllMapObjects {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("class", "java");
        map.put("hello","world");
        map.put("nadir","soft skills");
        map.put(null, "nothing");
        System.out.println(map);

        System.out.println();

        Map<String,String> linked= new LinkedHashMap<>();
        linked.put("class", "java");
        linked.put("hello","world");
        linked.put("nadir","soft skills");
        linked.put(null, "nothing");
        System.out.println(linked);

        Map<String,String> treeMap= new TreeMap<>();
       treeMap.put("class", "java");
        treeMap.put("hello","world");
        treeMap.put("nadir","soft skills");
        treeMap.put(null, "nothing");
        System.out.println(treeMap);

        Map<String,String> hashTable= new Hashtable<>();
        hashTable.put("class", "java");
        hashTable.put("hello","world");
        hashTable.put("nadir","soft skills");
        hashTable.put(null, "nothing");
        System.out.println(hashTable);


    }
}
