package day31_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
         int [] nums  = {10,40,67,2,3};
         int [] notSorted = nums;
         Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));

        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length-1]);









    }




}
