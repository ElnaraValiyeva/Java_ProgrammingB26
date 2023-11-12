package Day38_Wrapper_Arraylist;

import java.util.ArrayList;

public class JavaWrapper {
    public static void main(String[] args) {
        // add element
        //create arraylist
        ArrayList<String> lan = new ArrayList<>();

        // insert element to the arraylist
        lan.add("Java");
        lan.add("Phthon");

        lan.add(0,"hi");

        System.out.println("ArrayList : " + lan);


        //add(index, element);

        ArrayList<Integer> num = new ArrayList<>();
        num.add(0);
        num.add(1);
        System.out.println("ArrayList: " + num);




    }



}
