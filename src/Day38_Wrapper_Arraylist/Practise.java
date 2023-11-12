package Day38_Wrapper_Arraylist;

import java.util.ArrayList;

public class Practise {
    public static void main(String[] args) {
        ArrayList<String> hi = new ArrayList<>();
        hi.add("bread");
        hi.add("water");
        hi.add("Melon");
        hi.remove("Melon");
        System.out.println(hi);
        System.out.println(hi.remove(hi.size()-1));


        ArrayList<Integer> primeNumber= new ArrayList<>();

        primeNumber.add(2);
        primeNumber.add(3);
        primeNumber.add(5);
        System.out.println("Arraylist: " + primeNumber);

        // remove element at index 2

        int removeElement = primeNumber.remove(2);
        System.out.println("Removed Element: " + removeElement);

        //remove element from ArrayList

        ArrayList<String> word = new ArrayList<>();
        word.add("Java");
        word.add("Python");
        word.add("Java");

        // remove the element Java
        boolean result = word.remove("Java");

        System.out.println("Is element Java removed " + result);
        System.out.println("ArrayList after remove:" +  word);

        String element = word.remove(1);
        System.out.println("Remove element: " + element);
        System.out.println("After remove ArrayList: " + word);





    }
}
