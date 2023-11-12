package Day3_Arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char [] letters = {'j','a','v','a'};

        String word = "java";

        char [] java = word.toCharArray();

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

   //     System.out.println(letters);


        for(char eachChar : java){
            System.out.println(eachChar);
            }
        System.out.println(java[0]);


        char [] day = {'m','o','n','d','a','y'};
        System.out.println(day.length);

        String strDay = new String(day);
        System.out.println(strDay);
        System.out.println(strDay.toUpperCase());
        System.out.println(day);
        System.out.println(strDay.toLowerCase());


        }

    }







