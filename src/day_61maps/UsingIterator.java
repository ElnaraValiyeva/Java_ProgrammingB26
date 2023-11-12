package day_61maps;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("james");
        names.add("emre");
        names.add("ella");
        System.out.println(names);

        Iterator<String> it = names.iterator();

        System.out.println(it.next());//move the pin and return the element
        System.out.println(it.next());


    }
}
