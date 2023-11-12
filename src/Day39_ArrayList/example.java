package Day39_ArrayList;

import java.util.ArrayList;

public class example {
    public static void main(String[] args) {
        ArrayList<String> hi = new ArrayList<>();
         hi.add("jina");
         hi.add("juna");
         hi.add("mouse");

        System.out.println(hi);

        ArrayList<String> hi2 = new ArrayList<>(hi);
        hi2.add("salam");
        System.out.println(hi2);

        String item = hi.remove(0);
        System.out.println(item);
        System.out.println(hi);








    }
}
