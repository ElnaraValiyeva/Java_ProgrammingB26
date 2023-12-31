package Day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIfExample {
    public static void main(String[] args) {

        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4,6,2,5,12,9,143,4));



        ArrayList<Integer> nums2 = new ArrayList<>(base);
        base.removeIf(n -> n % 2 == 0);
        System.out.println(base);

        ArrayList<Integer> nums3 = new ArrayList<>(base);
        nums2.removeIf(each ->each > 10);
        System.out.println(nums2);

        ArrayList<String> days = ArrayListWithMethods.getDaysOfWeek();
        days.removeIf(day ->day.startsWith("S")|| day.startsWith("T"));
        System.out.println(days);    }
}
