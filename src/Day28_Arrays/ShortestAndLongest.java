package Day28_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestAndLongest {
    public static void main(String[] args) {


        String [] strs = {"apple", "java", "computer","water"};
        String smallest = strs[0];
        String biggest = strs[0];

        for(int i = 0; i < strs.length; i++){

            if(strs[i] .length() > biggest.length()){
                biggest = strs[i];
            }

            if(strs[i].length() < smallest.length()){
                smallest = strs[i];
            }
        }

        System.out.println("Biggest String: " + biggest);
        System.out.println("Smallest String: " + smallest);


        /*


        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length");
        String [] arr = new String[input.nextInt()];
        int shortest = Integer.MAX_VALUE;
        String res = "";
        input.nextLine();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter a word");
            arr[i] = input.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() <= shortest){
                if(arr[i].length() == shortest){
                    res += ", " + arr[i];
                } else {
                    res = arr[i];
                }
                shortest = arr[i].length();
            }
        }

        System.out.println("\n--------RESULT--------");
        System.out.println("Shortest word length: " + shortest + ": " + res);
    }



         */
    }
}
