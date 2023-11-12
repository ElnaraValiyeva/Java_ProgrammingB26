package Task;

import java.util.Arrays;

public class ContainsArray {

    public static void ContainsNUmber(int [] num, int n) {
/*
Create a method that accepts an int array and a number. Check if the array
contains that number or not
Ex:
input: ( {1, 2, 3, 4}, 4 ) -> true
input: ( {1, 2, 3, 4}, 7 ) -> false
______________________________________________________



 */

        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == n) {
                count++;
            }
        }
        System.out.println(count > 0 ? true : false);

    }

    public static void main(String[] args) {
        ContainsNUmber(new int[] {1,23,4},4);
        ContainsNUmber(new int [] {1,2,3,4},7);
    }




}


