package day31_arrays;

import java.util.Arrays;

public class JoinArray {
    public static void main(String[] args) {

        String [] word = {"a","b","c",};
        System.out.println(Arrays.toString(word));

        System.out.println(String.join("---", word));
    }
}
