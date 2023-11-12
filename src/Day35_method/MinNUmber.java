package Day35_method;

import java.util.Arrays;

public class MinNUmber {
    public static int minNumber(int [] nums){



        int min = nums[0];

        for(int num : nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
    public static int maxnumber(int [] nums){

        int max = nums[0];

        for(int num : nums) {
            if (num > max) {
                max = num;

            }

        }
        return max;

    }

}




