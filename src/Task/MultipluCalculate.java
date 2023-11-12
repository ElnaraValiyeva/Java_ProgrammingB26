package Task;

import java.util.Arrays;

public class MultipluCalculate {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, // {10, 6, 9},{10, 10, 70},{10, 10, 70};
                        {2, 5, 10},
                        {0, 3, 20}};

        int [][]array2 ={{10, 4, 3},
                          {5, 2, 7},
                        {100, 20, 5}};

        int[][]array3 = new int[3][3];

           for (int i =0; i <array.length;i++){
            for (int j =0; j <array2.length;j++){

                array3[i][j]=array[i][j]*array2[i][j];


            }
        }
        System.out.println(Arrays.deepToString(array3));






//        Given two 2D arrays multiply them together and store the results into a new 2D array. Multiple each number in each position as its own calculation

  //      Ex:

  //
 ///       x

 //       {10, 4, 3}
//        {5, 2, 7}
  //      {100, 20, 5}

  //      Output:

 //       {10, 6, 9}
  //      {10, 10, 70}
  //      {0, 60, 100}
    }
}
