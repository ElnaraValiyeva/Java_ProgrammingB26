package week08;

import java.util.ArrayList;

public class Task2 {
    public static ArrayList<Integer> evenNumberList(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : arr){
            if(num % 2 == 0 && !result.contains(num)){
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] x ={2,2,0};
        int [] y ={2,2,0};
        int [] z = {1,3,5};
        System.out.println(evenNumberList(x));
        System.out.println(evenNumberList(y));
        System.out.println(evenNumberList(z));
    }
}
