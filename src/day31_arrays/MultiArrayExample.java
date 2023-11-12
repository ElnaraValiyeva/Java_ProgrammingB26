package day31_arrays;

import java.util.Arrays;

public class MultiArrayExample  {
    public static void main(String[] args) {

        int [] firstArray= {30,50,60};
        int [] secondArray = {5,60,100,50,80};

        int [] [] all = {firstArray,secondArray};
        System.out.println(all);
        System.out.println(Arrays.toString(all));
        System.out.println("____");
        System.out.println(Arrays.deepToString(all));
        System.out.println("First array: " + Arrays.toString(all[0]));
        System.out.println("Second array: " + Arrays.toString(all[1]));

        System.out.println("----");

        int [] [] multi = {
                {90,80,70},
                {20,30,50},
                {100,30,60},
                {14},
                {5},
        };
        System.out.println(multi.length);
        System.out.println(multi[0].length);
        System.out.println(multi[2][1]);
        System.out.println(multi[4].length);


    }



}
