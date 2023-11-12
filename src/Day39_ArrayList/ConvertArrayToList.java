package Day39_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Scanner [] s = new Scanner[2];


        Integer [] arr = {1,2,3};

        Arrays.asList(arr);

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        System.out.println(nums);

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(3,4,8));
        System.out.println(other);


        String [] a = {"Hi","Ji","Si"};
        Arrays.asList(a);




    }
}
