package day31_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String [] [] cydeo = new String[4][];

        System.out.println(Arrays.deepToString(cydeo));

        String [] groupOne ={"Ella","Senan"};
        cydeo[0]=groupOne;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Adding group 2");

        String [] groupeTwo = {"A","Q","G"};
        cydeo[1] = groupeTwo;
        System.out.println(Arrays.deepToString(cydeo));

        cydeo [2] = new String []{"Mustafa","Lima"};
        System.out.println(Arrays.deepToString(cydeo));

    }
}
