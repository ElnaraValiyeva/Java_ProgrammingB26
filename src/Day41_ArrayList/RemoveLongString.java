package Day41_ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static ArrayList<String> removeLongString(ArrayList<String> list,int maxLength){

        list.removeIf(word -> word.length() < maxLength);
         return list;


    }

    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>(Arrays.asList("one","two", "three","six"));
        System.out.println(removeLongString(word, 4));


        System.out.println("-----");

        ArrayList<String> word22 = new ArrayList<>();
        word22.addAll(Arrays.asList("Java","Pyton","C#","JavaScript"));
        word22.removeIf(e-> e.startsWith("J"));
        System.out.println(word22);

    }



}
