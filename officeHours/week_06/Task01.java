package week_06;



/*
Task 1 : Reverse the number
 */
public class Task01 {
    public static void main(String[] args) {

    }

    public static int[] reverseArray(int[] arr){

        //firstly great empty  array/then i will provide a value equals arr length

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            result[i] = arr[arr.length-1];// result i item value start zero and


        }

        return result;


    }

}
