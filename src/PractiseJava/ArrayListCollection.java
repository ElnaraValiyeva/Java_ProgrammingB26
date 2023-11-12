package PractiseJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,500,30,40,20,20));
        Collections.sort(numbers);
        System.out.println(numbers);

        Integer max = Collections.max(numbers);
        Integer min = Collections.min(numbers);
        Collections.min(numbers);
        System.out.println("max= " + max );
        System.out.println("min= " + min);

        Collections.reverse((numbers));
        System.out.println(numbers);

        Collections.swap(numbers ,1 , 2);
        System.out.println(numbers);
        Collections.swap( numbers, 0,numbers.size()-1);
        System.out.println(numbers);

        System.out.println("------");
        numbers.addAll(Arrays.asList(20,20,20));

        int count = Collections.frequency(numbers, 20);
        System.out.println(count);








    }
}

