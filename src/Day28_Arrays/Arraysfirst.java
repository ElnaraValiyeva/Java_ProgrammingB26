package Day28_Arrays;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Arraysfirst {
    public static void main(String[] args) {
        String cityOne = "Chicago";
        String cityTwo = "New York";
        String cityThree = "Houston";
        String cityFour = "Denver";

        String [] cities ={ "Chicago", "New York", "Denver", "Houston"};
        System.out.println(cities[1] + ", " +  cities[2] + ", "  + cities[3] + "," + cities[0]);


        System.out.println("+++++++++");

        int [] my_array1 = {123,345,568,100};
        String [] my_array2 ={" Chicago", " New York", "Houston", "Denver"};

        System.out.println(Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println( Arrays.toString(my_array1));
        System.out.println(Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println(Arrays.toString(my_array2));

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 5;
        System.out.println(numbers);

        System.out.println("++++++");

        double [] arr = new double[4] ;
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        arr[0] = 30.99;
        System.out.println(Arrays.toString(arr));

        arr[1] = 12.55;
        arr[2] = 10.20;
        arr[3] = 5;
        System.out.println(Arrays.toString(arr));

        arr[2] = 2000;
        System.out.println(Arrays.toString(arr));

        arr = new double[5];
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[1]);






    }






}
