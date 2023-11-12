package Day39_ArrayList;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {

        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.add(100);

        System.out.println(nums.indexOf(100));

        System.out.println(nums.indexOf(700));

        int i = nums.indexOf(200);
        System.out.println(i);

        System.out.println(nums.lastIndexOf(100));

        // middle 100

        nums.set(nums.indexOf(100),0 );
        System.out.println(nums.indexOf(100));

        ArrayList<Integer> print=new ArrayList();

        print.add(400);
        print.add(500);
        print.add(900);

        System.out.println(print);
        System.out.println(print.indexOf(900));
        for(Integer each :print){
            System.out.println(print);
            System.out.println(" ");
            int arr = print.indexOf(400);
            System.out.println(arr);
        }





    }
}
