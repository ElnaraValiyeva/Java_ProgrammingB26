package Day37_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        numbers.add(100);
        numbers.add(234);
        numbers.add(56);
        numbers.add(45);
        System.out.println(numbers);
        System.out.println(numbers.get(1));
        System.out.println(numbers.size());

        System.out.println(numbers.size()-1 + 1);


    }
}
