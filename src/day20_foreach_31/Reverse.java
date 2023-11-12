package day20_foreach_31;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};

        int [] reverse = new int[array.length];

        for (int i = array.length -1, j=0;i >=0; i--, j++) {
            reverse[j] = reverse[i];


        }
        System.out.println(Arrays.toString(reverse));


    }

}
