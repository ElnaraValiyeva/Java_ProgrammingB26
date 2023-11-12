package Task;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {


        int[][] num = {{3, 5, 1},
                {1, 6, 10},
                {5, 21, 10}};


        int first = num[0][0] + num[1][1] + num[2][2];
        System.out.println(first);
        int second = num[0][2] + num[1][1] + num[2][0];
        System.out.println(second);
        if (first > second) {
            System.out.println("first diagonal " + first);
        } else if (second > first) {
            System.out.println("second diagonal " + second);
        }

        char[][] chars = new char[3][];

        char[] firstArray = {'a', 'b', 'c'};
        chars[0] = firstArray;
        char[] secondArray = {'d', 'e', 'f'};
        chars[1] = secondArray;
        char[] thirdArray = {'g', 'h', 'i'};
        chars[2] = thirdArray;

        System.out.println("" + firstArray[0] + secondArray[1] + thirdArray[2] + " and " + firstArray[2] + secondArray[1] + thirdArray[0] + " are the diagonals");


    }



        /*
        Given a 2D array with values:

	{3, 5, 1}
	{1, 6, 10}
	{5, 21, 10}


Calculate and find the biggest diagonal

	if an array was

	a b c
	d e f
	g h i

	aei and ceg would be the diagonals


	char [][] chars = new char[3][];

        char [] firstArray = {'a', 'b', 'c'};
        chars[0] = firstArray;
        char [] secondArray = {'d', 'e', 'f'};
        chars[1] = secondArray;
        char [] thirdArray = {'g', 'h', 'i'};
        chars[2] = thirdArray;

        System.out.println("" + firstArray[0] + secondArray[1] + thirdArray[2] + " and " + firstArray[2] + secondArray[1] + thirdArray[0] + " are the diagonals");
    }

         */


}


