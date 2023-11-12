package Day09_03_22;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        String [] colors= {"Yellow","Blue","Pink"};
        int [] numbers = new int [3];
        System.out.println(Arrays.toString(numbers));

        numbers [0] =1;
        numbers [1] =1;
        numbers [2] =1;

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);

        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(colors).replace("[", "").replace("]","").toLowerCase().trim());

        //get me last element of colors
        System.out.println(colors[colors.length-1]);

        System.out.println();
        String name = "Cydeo";
        char [] chars = name.toCharArray();
        System.out.println(Arrays.toString(chars));

        String[] split = name.split("");
        System.out.println(Arrays.toString(split));


        String a = " a b c a b c a b c";


        String [] abc = a.split("l");
        System.out.println(Arrays.toString(abc));




    }
}
