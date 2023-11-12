package Day39_ArrayList;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("alma");
        name.add("fistiq");
        name.add("banan");

        String item = name.remove(0);//removes the first index which is computer
        name.add(2,"hi");
        System.out.println(item);
        System.out.println(name);

       boolean bool =  name.remove("fistiq");
        System.out.println(bool);
        System.out.println(name);

    }


}
