package day60_collection;

import java.util.*;

public class SetVsList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        System.out.println(list);
        System.out.println("first: " + list.get(0));
        System.out.println("last: " + list.get(list.size()-1));

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        System.out.println(set);
       // System.out.println("first: " + list.get(0));
       // System.out.println("last: " + list.get(list.size()-1));

        for(int each : set){
            System.out.println(each);

        }
        //sort my Hashset
        System.out.println(new TreeSet<>(set));

        // converting list to set
        System.out.println(new LinkedList<>(list));

        System.out.println(new HashSet<>(Arrays.asList(1,5,2,1,4,2,5,1)));

        String s = "aaaabbbbcccccddddeee";
        System.out.println(new HashSet<>(Arrays.asList(s.split("")))
                .toString()
                .replace(", ", "")
                .replace("[", "")
                .replace("]", ""));

    }
}
