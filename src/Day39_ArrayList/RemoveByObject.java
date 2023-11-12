package Day39_ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.remove(0);
        System.out.println(nums);

        nums.clear();

        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());




        Integer i = 500;

        nums.remove(i);
        System.out.println(nums);

        nums.remove(Integer.valueOf(200));
        System.out.println(nums);


        Integer j = 800;
        nums.remove(j);
    }

}
