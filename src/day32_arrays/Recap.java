package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to start with");
        int size =input.nextInt();
        int [] nums = new int[size];

        for(int i=0; i < nums.length; i++){
            System.out.println("Enter a number");
            nums[i] = input.nextInt();

        }
        System.out.println("Array so far: " + Arrays.toString(nums));
        int [] expended = Arrays.copyOf(nums, nums.length +1);

        System.out.println("Enter the last number");
        expended[expended.length-1] = input.nextInt();
        System.out.println(Arrays.toString(expended));



    }
}
