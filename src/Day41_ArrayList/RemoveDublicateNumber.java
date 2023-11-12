package Day41_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDublicateNumber {

    public static ArrayList<Integer> removeDublicates(ArrayList<Integer> numbers){

        numbers.removeIf(num-> Collections.frequency(numbers,num)>1);
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,3,5,1,4));
        System.out.println(removeDublicates(nums));
    }

}
