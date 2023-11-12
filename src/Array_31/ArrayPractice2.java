package Array_31;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int[] arr1 = new int[100];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;


        }

        System.out.print("arr1 = " + Arrays.toString(arr1));
        
        
         int[] arr2 = new int[90];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 100-i;
            
        }
        System.out.println("arr2" + Arrays.toString(arr2));


        
    }
    
    


}
