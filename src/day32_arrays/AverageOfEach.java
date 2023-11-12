package day32_arrays;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
       int [] [] array = {{3, 4, 5,6},
                          {5,2,6},
                        {10,20,30}};
        double sum = 0;
        double total =0;
        int totallength =0;
        int count = 0;

        for (int i = 0; i < array.length; i ++) {

            double sum1 = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
                double average = sum/array[i].length;

                System.out.println(Arrays.toString(array[i])+ ("The average is:" + average));
                total+=sum;
                totallength+= array.length;
                System.out.println(total/totallength);
    }



}

    }
}
