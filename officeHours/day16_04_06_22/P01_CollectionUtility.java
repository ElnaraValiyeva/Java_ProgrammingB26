package day16_04_06_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P01_CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);
        numbers.set(numbers.size()-1,0 );
        System.out.println(numbers);

        System.out.println("===2===");
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

        System.out.println("=====3====");

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i)%2==1){
                numbers.set(i,numbers.get(i)*2);

            }
        }
        System.out.println(numbers);

        char [] arr1 = {'A','B','C'},
        arr2 ={'D','E','F','G'};

        ArrayList<Character>charResult = new ArrayList<>();
        //charResult.addAll(Arrays.asList(arr2))

        for(char ecshChar : arr1){
            charResult.add(ecshChar);
        }
        System.out.println(charResult);

        for(char eachChar: arr2){
            charResult.add(eachChar);
        }
        System.out.println(charResult);




    }



}
