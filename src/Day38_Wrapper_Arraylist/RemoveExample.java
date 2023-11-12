package Day38_Wrapper_Arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String>list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("wood");
        System.out.println(list);



        System.out.println(list.remove(list.size()-1));

        list.remove("sun");
        System.out.println(list);
        System.out.println(list.remove("apple"));


        list.add("light");
        list.add("light");
        System.out.println(list);
        list.remove("light");
        System.out.println(list);
        System.out.println(list.remove(list.size()-1));
    }
}
