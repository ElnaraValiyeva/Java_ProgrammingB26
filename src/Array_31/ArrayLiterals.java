package Array_31;

import java.util.Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums ={10,20,30,40,50};

        System.out.println(numbers.length);
        System.out.println("numbers: " + Arrays.toString(numbers));

        System.out.println("-------------------------------------");

        String [] month = {"January","Feb","Mart"};

        System.out.println("month: " + Arrays.toString(month));

        System.out.println("---------------");
        for (int i = month.length -1;i >=0; i++) {
            System.out.println(month[i]);

        }




    }

}
