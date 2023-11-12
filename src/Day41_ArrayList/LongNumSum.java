package Day41_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class LongNumSum {

    public static ArrayList<Integer> sumFromString(ArrayList<String> list){

        ArrayList<Integer> sums = new ArrayList<>();
         for(String each : list){
             int cureentSum = 0;

             for(String eachDigit : each.split("")){// converting the String
                 cureentSum +=Integer.parseInt(eachDigit);

             }
             sums.add(cureentSum);



         }
         return sums;
    }

    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList(Arrays.asList("123", "1111","34"));
        System.out.println(sumFromString(list));
    }

    /*

    public static ArrayList<Integer> summedNums (ArrayList<String> nums){
        ArrayList<Integer> b = new ArrayList<>(nums.size());
        for(int i = 0; i < nums.size(); i++){

            int sum = 0;
          for (int j = 0; j < nums.get(i).length() ; j++) {
         sum += Integer.parseInt(nums.get(i).charAt(j) + "");
            }
            b.add(sum);
        }
       return b;
    }
     */


}
