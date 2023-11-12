package day10_03;

import java.util.Arrays;

public class MultipleOfTen {
    public static void main(String[] args) {

        int [] newArray ={5,4,40,1,60,2,30,34,70,43,2, 80,67};
        int factor =0;

        for(int i =0; i< newArray.length; i++){

            if(newArray[i]% 10 ==0){
                factor = newArray[i]/10;
            }
            if(factor > 0){
                newArray[i] = factor * 10;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
