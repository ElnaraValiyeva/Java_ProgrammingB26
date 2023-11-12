package day20_foreach_31;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[] args) {

        String str = "Cydeo School";

       char[]  ch = str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("----------------");

        String str2 = "Today is Saturday";

        String [] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("------------");


        String [] sen = {"I love Java"};

        String  reverse="";

        for (int i =0; i < sen.length -1; i--) {
            reverse+=sen[i];


        }
        System.out.println(Arrays.toString(sen));

        System.out.println("--------------");

        int [] nums ={100,80,90,75,80,99};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));









    }

}
