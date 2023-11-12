package Task;

import java.util.Arrays;

public class Arraywithtennumber {
    public static void main(String[] args) {

        int [][] array = new int [10][10];

        int counter = 1;

        for(int i =1; i < array.length;i++)
            for(int j=0; j<array[i].length;j++){
                array[i][j]=counter;
                counter++;

            }
        System.out.println(Arrays.deepToString(array));




        }



        /*
        Create an empty 2D array with size 10 and each inner array with size 10.
Fill the elements of the 2D array with numbers from 1 - 100 where each
array starts from the number after the last number in the previous array.
The goal is to print the numbers of 1-10, 11- 20, 21-30, etc.. until the
end on separate lines
Ex:



         */

    }

