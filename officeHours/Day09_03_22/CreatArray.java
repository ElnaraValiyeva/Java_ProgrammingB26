package Day09_03_22;

import java.util.Arrays;

public class CreatArray {
    public static void main(String[] args) {

        int start = 11;
        int end = 18;
        int lenght =end-start;
        int [] newArray= new int[lenght];

        for(int i =0 ;i < newArray.length;i++){
            newArray[i] =start++;
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println();

        for(int each:newArray){
            each+=1;
        }
        System.out.println(Arrays.toString(newArray));




    }
}
